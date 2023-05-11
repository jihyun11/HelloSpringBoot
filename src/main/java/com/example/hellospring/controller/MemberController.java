package com.example.hellospring.controller;

import com.example.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired //의존관계를 주입해 준다. (DI)
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
