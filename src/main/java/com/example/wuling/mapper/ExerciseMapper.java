package com.example.wuling.mapper;

import com.example.wuling.model.Exercise;
import com.example.wuling.model.ExerciseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseMapper {
    int countByExample(ExerciseExample example);

    int deleteByExample(ExerciseExample example);

    int insert(Exercise record);

    int insertSelective(Exercise record);

    List<Exercise> selectByExample(ExerciseExample example);

    int updateByExampleSelective(@Param("record") Exercise record, @Param("example") ExerciseExample example);

    int updateByExample(@Param("record") Exercise record, @Param("example") ExerciseExample example);

    List<Exercise> selectAllExercise();
}
