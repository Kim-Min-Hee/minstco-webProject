package controller.dao;

import controller.vo.MemberVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberDAO {

    @Autowired
   private SqlSession sqlSession;

    public int minstcoDB(MemberVO memberVO) {
         return sqlSession.insert("member.minstcoDB",memberVO);
    }

}
