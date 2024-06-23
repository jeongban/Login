package com.login.Logintest.controller;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    // /경로로 요청이 왔을 때 /경로로 맵핑 되어있는 메소드를 실행
    @GetMapping(value = "/")
    public String main () {
        return "main";
    }
}
