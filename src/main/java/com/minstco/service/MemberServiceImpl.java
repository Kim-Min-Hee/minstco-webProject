package com.minstco.service;


import com.minstco.dao.MemberDAO;
import org.apache.ibatis.session.SqlSession;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.minstco.vo.MemberVO;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

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

    public String idCheck(MemberVO memberVO)throws Exception {
        System.out.println("service : "+memberVO.getId());
        String result = memberDAO.idCheck(memberVO);
        System.out.println("service1 : "+result);
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
