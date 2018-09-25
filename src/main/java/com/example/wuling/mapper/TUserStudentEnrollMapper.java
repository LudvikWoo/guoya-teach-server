package com.example.wuling.mapper;

import com.example.wuling.model.TUserStudentEnroll;
import com.example.wuling.model.TUserStudentEnrollExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TUserStudentEnrollMapper {
    int countByExample(TUserStudentEnrollExample example);

    int deleteByExample(TUserStudentEnrollExample example);

    int deleteByPrimaryKey(Integer enrollId);

    int insert(TUserStudentEnroll record);

    int insertSelective(TUserStudentEnroll record);

    List<TUserStudentEnroll> selectByExample(TUserStudentEnrollExample example);

    TUserStudentEnroll selectByPrimaryKey(Integer enrollId);

    int updateByExampleSelective(@Param("record") TUserStudentEnroll record, @Param("example") TUserStudentEnrollExample example);

    int updateByExample(@Param("record") TUserStudentEnroll record, @Param("example") TUserStudentEnrollExample example);

    int updateByPrimaryKeySelective(TUserStudentEnroll record);

    int updateByPrimaryKey(TUserStudentEnroll record);
}