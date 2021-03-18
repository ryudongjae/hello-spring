package ryudongjae.hellospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ryudongjae.hellospring.service.MemberService;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired //생성자 주입
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
