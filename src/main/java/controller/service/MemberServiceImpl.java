package controller.service;

import controller.dao.MemberDAO;
import controller.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    MemberDAO memberDAO;

    public void minstcoDB(MemberVO memberVO) {
        //db와 연결 시작. (insert)
        memberDAO.minstcoDB(memberVO);
    }
}
