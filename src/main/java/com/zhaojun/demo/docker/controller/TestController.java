package com.zhaojun.demo.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhaoJun
 * @date 2019/8/20 14:24
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(@RequestParam(value = "name", defaultValue = "蒙奇D·路飞") String name) {
        return name + " 是要成为海贼王得男人";
    }
}
