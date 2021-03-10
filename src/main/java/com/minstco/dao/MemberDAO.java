package com.minstco.dao;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.minstco.vo.MemberVO;

@Repository
public class MemberDAO {

    @Autowired
   private SqlSession sqlSession;

    public int insertMember(MemberVO memberVO) {
         return sqlSession.insert("member.memberInsert",memberVO);
    }

    public int  idCheck(String id){
        int result =  sqlSession.selectOne("member.idCheck",id);
        return result;
    }
}
