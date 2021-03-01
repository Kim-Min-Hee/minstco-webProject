package service;


import org.springframework.stereotype.Service;
import vo.MemberVO;

@Service
public interface MemberService {

   public void insertMember (MemberVO memberVO);
}
