package controller.service;

import controller.dao.MemberDAO;
import controller.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService implements IMemberService{

    @Autowired
    MemberDAO memberDAO;

    @Override
    public List<MemberVO> getMember() {
        System.out.println("!@#$%^");
        return memberDAO.getMember();
    }
}
