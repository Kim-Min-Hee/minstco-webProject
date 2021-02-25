package controller.service;

import controller.dao.MemberDAO;
import controller.vo.MemberVO;

public class MemberService {

    private static MemberService memberService = new MemberService();
    public MemberDAO memberDAO = MemberDAO.getInstance();

    private MemberService(){}

    public static MemberService getInstance(){
        return memberService;
    }

    public void memberInsert(MemberVO memberVO) {
        memberDAO.memberInsert(memberVO);
    }
}
