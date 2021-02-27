package controller.service;

import controller.vo.MemberVO;
import org.codehaus.plexus.component.annotations.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MemberService {

   public void minstcoDB (MemberVO memberVO);
}
