package com.minstco.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.minstco.vo.MemberVO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemberDAO {

    @Autowired
    private SqlSession sqlSession;

//    public int insertMember(MemberVO memberVO) {
//        return sqlSession.insert("member.memberInsert",memberVO);
//    }

    public List<Map<String,Object>> idCheck(Map<String,Object> map) throws Exception{
        //int result = sqlSession.selectOne("member.idCheck",memberVO);
        //sqlSession.select("member.idCheck",map);
        List<Map<String,Object>> list = new ArrayList();
        list = sqlSession.selectList("member.idCheck", map);

        for(Map<String,Object> map2 : list){
            System.out.println("select value :: "+map2);
        }

        System.out.println(map);
        return list;
    }

    public boolean joinCheck(MemberVO memberVO) throws Exception{
        boolean check = false;
        int result = sqlSession.selectOne("member.joinCheck",memberVO);
        System.out.println("result :: "+result);
        if(result>0){
            check= false;
        }else{
            check= true;
            sqlSession.insert("member.memberInsert",memberVO);
            System.out.println(memberVO.getId()+"!!!!");

        }
        System.out.println(check+"@@@@");
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
