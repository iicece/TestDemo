package com.example.demo.biz.service.impl;

import com.example.demo.biz.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.mapper.*;

/**
 * @author linjian
 * @date 2019/1/15
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public String test() {
        return "interface test";
    }
}