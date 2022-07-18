package com.mapper;

import com.entry.TabAccount;

import java.util.List;
import java.util.Map;

public interface TabAccount1Mapper {
    //查询所有记录
    List<Map> selectAll();
    //查询一条记录 可以写list也可以直接写map
    TabAccount selectById(int i);
}
