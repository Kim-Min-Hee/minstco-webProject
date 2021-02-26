package controller.service;

import controller.dao.MemberDAO;
import controller.vo.MemberVO;

public class MemberService {

    private final MemberDAO memberDAO;

    public MemberService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

//    @Override
//    public void register(MemberVO memberVO) throws Exception {
//        memberDAO.register(memberVO);
//    }
}
