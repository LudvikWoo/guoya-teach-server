package com.example.wuling.controller;

import com.example.wuling.model.Exercise;
import com.example.wuling.service.IExerciseSvc;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercise")
@Api("exerciseController相关api")
public class ExerciseController {
    @Autowired
    private IExerciseSvc exerciseSvc;

    @ApiOperation(value="findExercise",notes = "查询作业接口，该接口用于查询学生作业提交信息")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="path",name="pageNum",dataType="int",required=true,value="当前页码",defaultValue="1"),
            @ApiImplicitParam(paramType="path",name="pageSize",dataType="int",required=true,value="每页数量",defaultValue="10")
    })
    @RequestMapping(value="getAll/{pageNum}/{pageSize}",method = RequestMethod.GET)
    public List<Exercise> findExercise(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        System.out.println(pageNum+","+pageSize);

        List<Exercise> list= exerciseSvc.findAll(pageNum,pageSize);
        System.out.println(list.size());
        return list;
    }
}
