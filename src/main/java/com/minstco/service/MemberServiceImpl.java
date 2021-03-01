package com.minstco.service;


import com.minstco.dao.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.minstco.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberDAO memberDAO;

    public void insertMember(MemberVO memberVO) {
        //db와 연결 시작. (insert)
        memberDAO.insertMember(memberVO);
    }
}
