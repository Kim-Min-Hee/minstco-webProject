package com.minstco.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.minstco.vo.MemberVO;

import java.util.HashMap;
import java.util.List;

@Repository
public class MemberDAO {

    @Autowired
    private SqlSession sqlSession;

    public int insertMember(MemberVO memberVO) {
        return sqlSession.insert("member.memberInsert",memberVO);
    }

    public int idCheck(MemberVO memberVO) throws Exception{
        int result = sqlSession.selectOne("member.idCheck",memberVO);
        return result;
    }

    public boolean joinCheck(MemberVO memberVO) throws Exception{
        boolean check = false;
        int result = sqlSession.selectOne("member.joinCheck",memberVO);
        if(result>0){
            check= false;
        }else{
           check= true;
        }
        return check;
    }


    public boolean loginCheck(MemberVO memberVO){
        String name= sqlSession.selectOne("member.loginCheck",memberVO);
        System.out.println(name);
        return (name == null) ? false : true;
    }

    public MemberVO viewMember(MemberVO memberVO){
        return sqlSession.selectOne("member.viewMember",memberVO);
    }
}
