package com.minstco.service;


import com.minstco.dao.MemberDAO;
import org.json.simple.JSONObject;
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

//    public int idCheck(MemberVO memberVO)throws Exception {
//        System.out.println("service : "+memberVO.getId());
//       int result = memberDAO.idCheck(memberVO);
//        System.out.println("service : "+result);
//        return memberDAO.idCheck(memberVO);
//    }

    public MemberVO idCheck(MemberVO memberVO)throws Exception {
        System.out.println("service : "+memberVO.getId());
        System.out.println("service : "+memberDAO.idCheck(memberVO));
        return memberDAO.idCheck(memberVO);
    }

    public boolean loginCheck(MemberVO memberVO, HttpSession session) {
        System.out.println("service : "+memberVO.getId());
        boolean result = memberDAO.loginCheck(memberVO);
        System.out.println(result);
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
