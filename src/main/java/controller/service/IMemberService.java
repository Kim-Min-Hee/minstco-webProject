package controller.service;

import controller.vo.MemberVO;

public interface IMemberService {

    void register(MemberVO memberVO) throws Exception;
}
