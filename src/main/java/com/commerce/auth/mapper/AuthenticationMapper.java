package com.commerce.auth.mapper;


import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AuthenticationMapper {

    String selectUserName(String id);
}

