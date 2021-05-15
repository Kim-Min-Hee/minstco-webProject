package com.minstco.service;

import org.springframework.stereotype.Service;
import com.minstco.vo.MemberVO;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Service
public interface MemberService {


   // public MemberVO insertMember  (MemberVO memberVO) throws  Exception;

    public boolean joinCheck (MemberVO memberVO) throws Exception;

    public boolean idCheck(Map<String,Object> map)throws Exception;

    public boolean loginCheck(MemberVO memberVO, HttpSession session);

    public MemberVO viewMember(MemberVO memberVO);


}
