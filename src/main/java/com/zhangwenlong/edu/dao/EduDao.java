package com.zhangwenlong.edu.dao;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Map;

//@Component
//@Repository
@Mapper
public interface EduDao {
    @MapKey("com.zhangwenlong.edu.model.Edu")
    Map list();

}
