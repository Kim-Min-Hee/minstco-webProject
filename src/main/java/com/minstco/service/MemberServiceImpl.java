package com.minstco.service;


import com.minstco.dao.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.minstco.vo.MemberVO;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberDAO memberDAO;

//    public MemberVO insertMember(MemberVO memberVO) throws Exception {
//        //db와 연결 시작. (insert)
//        memberDAO.insertMember(memberVO);
//
//        return memberVO;
//    }

    public boolean idCheck(Map<String,Object> map)throws Exception {
        //int result = memberDAO.idCheck(memberVO);
        boolean idchk = false;
        List list = memberDAO.idCheck(map);
        if(list.size()>0) {
            //id 존재
            idchk = false;
        }else{
            idchk = true;
        }
        //System.out.println("service : "+result);
        return idchk;
    }

    public boolean joinCheck (MemberVO memberVO) throws Exception{
        System.out.println("service : "+memberVO.getName());
        boolean result = memberDAO.joinCheck(memberVO);
        System.out.println(result);
        return result;
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