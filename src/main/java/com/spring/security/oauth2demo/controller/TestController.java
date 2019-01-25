package com.spring.security.oauth2demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author 刘海飞
 * @Date 2019/1/24 19:24
 * @Version 1.0
 **/
@RestController
public class TestController {

    /**
     * @param
     * @return
     * @Description: 获取产品id
     * @author lhf
     * @date 2019/1/25 9:56
     */
    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable String id) {
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();
        return "product id" + id;
    }

    /**
     * @param
     * @return
     * @Description: 获取ordier id
     * @author lhf
     * @date 2019/1/25 9:57
     */
    @GetMapping("/order/{id}")
    public String getOrder(@PathVariable String id) {
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();
        return "order id" + id;
    }

}
