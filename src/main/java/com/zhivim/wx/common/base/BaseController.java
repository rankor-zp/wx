package com.zhivim.wx.common.base;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Base")
@Api("BaseController")
public class BaseController {
    @GetMapping("/index")
    public String index(){
        return "Hello world";
    }
    @GetMapping
    public String defaults(){
        return "Default Page";
    }
}
