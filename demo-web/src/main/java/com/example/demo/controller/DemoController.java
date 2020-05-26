package com.example.demo.controller;

import com.example.demo.biz.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author linjian
 * @date 2019/1/15
 */
@Controller
@RequestMapping("demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping("/test")
    public @ResponseBody
    String test() {
        return demoService.test();
    }
}