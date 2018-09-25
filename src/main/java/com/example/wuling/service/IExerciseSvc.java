package com.example.wuling.service;

import com.example.wuling.model.Exercise;

import java.util.List;

public interface IExerciseSvc {

    public List<Exercise> findAll(int pageNum, int pageSize);


}
