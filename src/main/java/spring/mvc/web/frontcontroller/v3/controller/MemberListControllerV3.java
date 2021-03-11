package spring.mvc.web.frontcontroller.v3.controller;

import spring.mvc.domain.member.Member;
import spring.mvc.domain.member.MemberRepository;
import spring.mvc.web.frontcontroller.ModelView;
import spring.mvc.web.frontcontroller.v3.ControllerV3;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        List<Member> members = memberRepository.findAll();
        ModelView mv = new ModelView("members");
        mv.getModel().put("members", members);

        return mv;
    }
}
