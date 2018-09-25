package com.example.wuling.service;

import com.example.wuling.bean.studentEnroll.StudentEnroll;
import com.example.wuling.bean.studentEnroll.addEnroll.AddEnrollReq;
import com.example.wuling.model.TUserStudentEnroll;

import java.util.List;

public interface ITUserStudentEnrollSvc {

    List<StudentEnroll> quryStuEnrolls(StudentEnroll studentEnroll);

    int addStudentEnroll(AddEnrollReq addEnrollReq);
}
