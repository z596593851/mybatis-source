package org.example;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mapper.UserTestMapper;

import java.io.IOException;
import java.io.Reader;

public class MybatisMain {

  public static void main(String[] args) throws IOException {
    // 加载xml文件获取session
    Reader reader = Resources.getResourceAsReader("config/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    SqlSession sqlSession = sqlSessionFactory.openSession();
//    UserTest userTest = sqlSession.selectOne("org.example.mapper.UserTestMapper.getUserOne", 2);
    UserTestMapper mapper = sqlSession.getMapper(UserTestMapper.class);
    System.out.println(mapper.getUserOne(2));
  }
}

