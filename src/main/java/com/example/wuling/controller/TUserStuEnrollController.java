package com.example.wuling.controller;

import com.example.wuling.bean.studentEnroll.Page;
import com.example.wuling.bean.studentEnroll.StudentEnroll;
import com.example.wuling.bean.studentEnroll.Test;
import com.example.wuling.bean.studentEnroll.addEnroll.AddEnrollReq;
import com.example.wuling.bean.studentEnroll.addEnroll.AddEnrollResp;
import com.example.wuling.model.TUserStudentEnroll;
import com.example.wuling.service.ITUserStudentEnrollSvc;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/studentEnroll")
@Api("TUserStuEnrollController相关api")
public class TUserStuEnrollController {
    @Autowired
    private ITUserStudentEnrollSvc studentEnrollSvc;

    @RequestMapping(value = "queryStudentEnroll",method = RequestMethod.POST)
    public List<StudentEnroll> queryStudentEnroll(@Validated({StudentEnroll.Query.class}) @RequestBody StudentEnroll studentEnroll,BindingResult stuBindingResult) {
        if(stuBindingResult.hasErrors()){
            for (FieldError fieldError : stuBindingResult.getFieldErrors()) {
                System.out.println(fieldError.getField()+" "+fieldError.getDefaultMessage());
            }
        }
        if(studentEnroll.getPage()!=null){
            System.out.println(studentEnroll.getPage().toString());
        }
        System.out.println(studentEnroll.toString());
        List<StudentEnroll> list = new ArrayList<StudentEnroll>();
        list=studentEnrollSvc.quryStuEnrolls(studentEnroll);
        System.out.println(list.size());
        return list;
    }

    @RequestMapping(value = "addStudentEnroll",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
            public AddEnrollResp addStudentEnroll(@Validated @RequestBody AddEnrollReq addEnrollReq, BindingResult stuBindingResult) {
        if(stuBindingResult.hasErrors()){
            for (FieldError fieldError : stuBindingResult.getFieldErrors()) {
                System.out.println(fieldError.getField()+" "+fieldError.getDefaultMessage());
            }
        }
        int enrollId= studentEnrollSvc.addStudentEnroll(addEnrollReq);
        AddEnrollResp resp=new AddEnrollResp();
        resp.setRespCode("0000");
        resp.setRespDesc("成功");
        resp.setEnrollId(enrollId);
        return resp;
    }
}
