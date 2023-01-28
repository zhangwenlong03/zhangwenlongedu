package com.zhangwenlong.edu.controller;

import com.zhangwenlong.edu.model.Edu;
import com.zhangwenlong.edu.service.EduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/edu")
public class educontroller {
//    @RequestMapping("/test")
//    public Map<String, Object> teacher(){
//        Map<String, Object> map = new HashMap<>();
//        map.put("test","test");
//        map.put("test1","test1");
//        map.put("test2","test2");
//        map.put("test3","test3");
//        map.put("test4","test4");
//        return map;
//    }
    /**
     * get方式请求 查询所有
     */
    @Autowired
    EduService eduService;
    @GetMapping("/findall")
    public Map<String, Object> findall(){
        Map list = eduService.list();
        return list;
    }
    /**
     * json格式传数据 并插入数据库
     */
    public Map<String, Object> add(){
        return null;
    }
}
