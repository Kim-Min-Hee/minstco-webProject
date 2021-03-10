package com.minstco.service;


import com.minstco.dao.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.minstco.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberDAO memberDAO;

    public MemberVO insertMember(MemberVO memberVO) throws Exception {
        //db와 연결 시작. (insert)
        memberDAO.insertMember(memberVO);

        return memberVO;
    }

    public int idCheck(String id) {
        int cnt = memberDAO.idCheck(id);
        return cnt;
    }


}
