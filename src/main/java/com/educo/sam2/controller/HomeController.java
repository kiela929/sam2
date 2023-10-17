package com.educo.sam2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j // log
public class HomeController {

    @RequestMapping("/homeView")
    public String home(){
        log.info("home Controller");
        return "home.html";}

}
