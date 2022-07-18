package com.tests;

import com.entry.TabAccount;
import com.mapper.TabAccount1Mapper;
import com.mapper.TabFunctionMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTest {
    public static void main(String[] args) throws IOException {
        SqlSessionFactoryBuilder bu = new SqlSessionFactoryBuilder();
        try {
            //直接从resources工具类路径开始
            InputStream is = Resources.getResourceAsStream("config/mybaits.xml");
            SqlSessionFactory sqlSessionFactory = bu.build(is);

            SqlSession sqlSession = sqlSessionFactory.openSession();
            //想办法找到获取接口  获取的是代理类
            TabAccount1Mapper roleMapper = sqlSession.getMapper(TabAccount1Mapper.class);
            List list = roleMapper.selectAll();
            System.out.println(list);

            TabAccount list1 = roleMapper.selectById(2);
            System.out.println(list1);

            TabFunctionMapper functionMapper = sqlSession.getMapper(TabFunctionMapper.class);
            List list2 = functionMapper.selectAll();
            System.out.println(list2);
            //数据插入
            Map map = new HashMap();
            map.put("aid",5);
            map.put("aname","king");
            functionMapper.insertFunction(map);
            sqlSession.commit();
            sqlSession.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
