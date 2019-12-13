package com.july.thyme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/{index}")
    public String test1(@PathVariable String index){
        return index;
    }

}
