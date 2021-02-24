package controller.member;

import controller.HttpUtil;
import controller.service.MemberService;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class MemberInsertController {

//    private static String id = null;
//    private static String password = null;
//    private static String name = null;
//    private static String phoneNumber = null;
//
//    @Override
//    public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        id = request.getParameter("id");
//        password = request.getParameter("password");
//        name = request.getParameter("name");
//        phoneNumber = request.getParameter("phoneNumber");
//
//        if(id.isEmpty()|| password.isEmpty() || name.isEmpty() || phoneNumber.isEmpty()){
//            request.setAttribute("error","모든항목을 다 적어주세요");
//            HttpUtil.forward(request,response,"/member/join.jsp");
//            System.out.println("!!!!!");
//        }
//
//        MemberVO memberVO = new MemberVO();
//        memberVO.setId(id);
//        memberVO.setPassword(password);
//        memberVO.setName(name);
//        memberVO.setPhoneNumber(phoneNumber);
//
//        MemberService memberService= MemberService.getInstance();
//        memberService.memberInsert(memberVO);
//
//        HttpUtil.forward(request,response,"/memberInsertOutut.jsp");
//        System.out.println("@@@");
//    }
}
