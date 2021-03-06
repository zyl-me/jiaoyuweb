package com.jiaoyu.mapper;

import com.jiaoyu.pojo.Asklist;
import com.jiaoyu.pojo.AsklistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AsklistMapper {
    int countByExample(AsklistExample example);

    int deleteByExample(AsklistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Asklist record);

    int insertSelective(Asklist record);

    List<Asklist> selectByExample(AsklistExample example);

    Asklist selectByPrimaryKey(Integer askid);

    int updateByExampleSelective(@Param("record") Asklist record, @Param("example") AsklistExample example);

    int updateByExample(@Param("record") Asklist record, @Param("example") AsklistExample example);

    int updateByPrimaryKeySelective(Asklist record);

    int updateByPrimaryKey(Asklist record);
}