package dao;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vo.MemberVO;

@Repository
public class MemberDAO {

    @Autowired
   private SqlSession sqlSession;

    public int insertMember(MemberVO memberVO) {
         return sqlSession.insert("member.minstcoDB",memberVO);
    }

}
