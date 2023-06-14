package com.jmoh.myeis.dao;

import com.jmoh.myeis.entity.TB_USER;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface UserDAO {

    @Select("SELECT * FROM TB_USER")
    List<TB_USER> getAllUsers();
}