package com.luhanlin.jenkins_test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <类详细描述> 测试
 *
 * @author luhanlin
 * @version [V_1.0.0, 2019-08-28 15:13]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String hello() {
        return "Hello Jenkins";
    }

}
