package com.uno.getinline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicController {

    @GetMapping("/")
    public String root() throws Exception{
        throw new Exception("404");
//        return "index";
    }


//    @RequestMapping("/error")
//    public String error(){
//        return "error";
//    }
}
