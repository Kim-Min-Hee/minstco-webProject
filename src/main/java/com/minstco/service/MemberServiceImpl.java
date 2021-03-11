package com.minstco.service;


import com.minstco.dao.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.minstco.vo.MemberVO;

import javax.servlet.http.HttpSession;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberDAO memberDAO;

    public MemberVO insertMember(MemberVO memberVO) throws Exception {
        //db와 연결 시작. (insert)
        memberDAO.insertMember(memberVO);

        return memberVO;
    }

    public int idCheck(MemberVO memberVO)throws Exception {
        int result = memberDAO.idCheck(memberVO);
        System.out.println(result);
        return result;
    }

    public boolean loginCheck(MemberVO memberVO, HttpSession session) {
        boolean result = memberDAO.loginCheck(memberVO);
        if(result){
            MemberVO memberVO1 = viewMember(memberVO);
            session.setAttribute("id",memberVO1.getId());
            session.setAttribute("name",memberVO1.getName());
        }
        return result;
    }

    public MemberVO viewMember(MemberVO memberVO) {
        return memberDAO.viewMember(memberVO);
    }


}
