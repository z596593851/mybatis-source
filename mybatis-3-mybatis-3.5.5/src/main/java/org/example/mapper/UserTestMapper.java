package org.example.mapper;
import org.apache.ibatis.annotations.Param;
import org.example.UserTest;

public interface UserTestMapper {

  UserTest getUserOne(@Param("id") int id);
}

