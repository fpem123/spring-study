package com.example.springstudy.controller;

import com.example.springstudy.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    // 필드주입, 별로 안 좋음
    // @Autowired private MemberService memberService;
    private final MemberService memberService;

    // 생성자 주입
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // setter 주입, 잘 못 바꾸면 문제가 생김
    /*
    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }
    */
}
