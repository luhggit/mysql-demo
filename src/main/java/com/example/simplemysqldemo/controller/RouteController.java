package com.example.simplemysqldemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 路由
 * @author lhg
 * @date 2019-07-24 13:55
 */
@Controller
public class RouteController {
    /**
     * route
     * @return
     */
    @RequestMapping("/{path}")
    public String index(@PathVariable String path){
        return path;
    }
}
