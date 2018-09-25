package com.example.wuling.service.impl;

import com.example.wuling.mapper.ExerciseMapper;
import com.example.wuling.model.Exercise;
import com.example.wuling.service.IExerciseSvc;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "exerciseSvc")
public class ExerciseSvcImpl implements IExerciseSvc {
    @Autowired
    public ExerciseMapper exerciseMapper;
    @Override
    public List<Exercise> findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return exerciseMapper.selectAllExercise();
    }
}
