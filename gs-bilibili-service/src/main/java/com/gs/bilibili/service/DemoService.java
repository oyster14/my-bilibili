package com.gs.bilibili.service;

import com.gs.bilibili.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DemoService {
    @Autowired
    private DemoDao demoDao;

    public Long query(Long id) {
        return demoDao.query(id);
    }
}
