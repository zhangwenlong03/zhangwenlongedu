package com.zhangwenlong.edu.service.Impl;
import com.zhangwenlong.edu.dao.EduDao;
import com.zhangwenlong.edu.service.EduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class EduServiceImpl implements EduService {
    @Autowired(required = false)
    private EduDao eduDao;
    @Override
    public Map list() {
        return eduDao.list();
    }
}
