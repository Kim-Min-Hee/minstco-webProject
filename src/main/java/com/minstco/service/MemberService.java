package com.minstco.service;

import org.springframework.stereotype.Service;
import com.minstco.vo.MemberVO;

import javax.servlet.http.HttpSession;

@Service
public interface MemberService {


   public MemberVO insertMember  (MemberVO memberVO) throws  Exception;

  public int idCheck (MemberVO memberVO) throws Exception;

   public boolean loginCheck(MemberVO memberVO, HttpSession session);

   public MemberVO viewMember(MemberVO memberVO);




}
