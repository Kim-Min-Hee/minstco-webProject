package controller.service;

import controller.member.MemberVO;

public interface MemberService {

    public void memberJoin(MemberVO memberVO) throws Exception;

    public MemberVO memberLogin(MemberVO memberVO) throws Exception;

}
