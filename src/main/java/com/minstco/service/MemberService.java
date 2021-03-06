package com.minstco.service;


import org.springframework.stereotype.Service;
import com.minstco.vo.MemberVO;

@Service
public interface MemberService {


   public MemberVO insertMember  (MemberVO memberVO) throws  Exception;
}
