package controller.dao;

import controller.vo.MemberVO;

public interface IMemberDAO {

    void register(MemberVO memberVO) throws Exception;
}
