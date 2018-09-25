package com.example.wuling.service.impl;

import com.example.wuling.bean.studentEnroll.StudentEnroll;
import com.example.wuling.bean.studentEnroll.addEnroll.AddEnrollReq;
import com.example.wuling.mapper.TUserStudentEnrollMapper;
import com.example.wuling.model.TUserStudentEnroll;
import com.example.wuling.model.TUserStudentEnrollExample;
import com.example.wuling.service.ITUserStudentEnrollSvc;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service(value = "studentEnrollSvc")
public class TUserStudentEnrollSvcImpl implements ITUserStudentEnrollSvc {
    @Autowired
    TUserStudentEnrollMapper tUserStudentEnrollMapper;

    @Override
    public List<StudentEnroll> quryStuEnrolls(StudentEnroll studentEnroll) {
        PageHelper.startPage(studentEnroll.getPage().getPageNum(), studentEnroll.getPage().getPageSize());
        List<StudentEnroll> result=new ArrayList<StudentEnroll>();
        TUserStudentEnrollExample example =new TUserStudentEnrollExample();
        TUserStudentEnrollExample.Criteria criteria = example.createCriteria();

        if(!StringUtils.isEmpty(studentEnroll.getEnrollId())){
            criteria.andEnrollIdEqualTo(studentEnroll.getEnrollId());
        }
        if(!StringUtils.isEmpty(studentEnroll.getCustomerName())){
            criteria.andCustomerNameLike("%"+studentEnroll.getCustomerName()+"%");
        }
        if(!StringUtils.isEmpty(studentEnroll.getCert())){
            criteria.andCertLike("%"+studentEnroll.getCert()+"%");
        }
        if(!StringUtils.isEmpty(studentEnroll.getEducation())){
            criteria.andEducationEqualTo(studentEnroll.getEducation());
        }
        if(!StringUtils.isEmpty(studentEnroll.getFeePayed())){
            criteria.andFeePayedGreaterThanOrEqualTo(studentEnroll.getFeePayed());
        }
        List<TUserStudentEnroll> list=tUserStudentEnrollMapper.selectByExample(example);
        for(TUserStudentEnroll item:list ){
            StudentEnroll s=new StudentEnroll();
            BeanUtils.copyProperties(item, s);
            result.add(s);
        }
        return result;
    }

    @Override
    public int addStudentEnroll(AddEnrollReq addEnrollReq) {
        TUserStudentEnroll record=new TUserStudentEnroll();
        record.setCustomerName(addEnrollReq.getCustomerName());
        record.setCert(addEnrollReq.getCert());
        record.setEducation(addEnrollReq.getEducation());
        record.setFeePayed(addEnrollReq.getFeePayed());
       tUserStudentEnrollMapper.insert(record);
        return record.getEnrollId();
    }
}
