package com.login.Logintest.controller;

import com.login.Logintest.dto.MemberFormDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/members")
@RequiredArgsConstructor
public class MemberController {

    // /new 경로로 get 요청이 왔을 때 /new 경로로 맵핑 되어있던 메소드를 실행
    // memberFomDto이름으로 MemberFormDto객체를 지정후 model을 사용해 view에서 사용할 수 있도록 한다.
    //
    @GetMapping(value = "/new")
    public String memberForm(Model model) {
        model.addAttribute("memberFormDto", new MemberFormDto());
        return "member/memberForm";
    }

    // /new 경로로 post 요청이 왔을 때, /new 경로로 맵핑 되어 있던 메소드 실행
    @PostMapping(value = "/new")
    public String memberForm() {
    return null;
    }
}
