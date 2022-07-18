package com.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface TabFunctionMapper {
    @Select("select * from tab_account")
    List<Map> selectAll();

    void insertFunction(Map map);
}
