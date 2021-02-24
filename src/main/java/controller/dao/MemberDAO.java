package controller.dao;

import controller.vo.MemberVO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemberDAO implements IMemberDAO{
    @Override
    public List<MemberVO> getMember() {

        List<MemberVO> members = new ArrayList<MemberVO>();

        MemberVO memberVO = new MemberVO();
        memberVO.setId("xldkah");
        memberVO.setPassword("mini");
        memberVO.setName("KimMinHee");
        memberVO.setPhoneNumber("010-1234-1234");
        members.add(memberVO);

        return members;
    }
}
