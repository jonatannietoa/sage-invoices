package com.sage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jonatannietoa on 29/3/17.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    String index(){
        return "index";
    }
}
