package com.minstco.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import com.minstco.service.MemberService;
import com.minstco.vo.LoginVO;
import com.minstco.vo.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.logging.SimpleFormatter;


@RequestMapping("/member/")
@Controller
public class MemberController  {

    ModelAndView modelAndView = new ModelAndView();

    @Autowired
    MemberService memberService;

    @RequestMapping(value = "join",method = RequestMethod.GET)
public ModelAndView memberWrite(){
    modelAndView.setViewName("member/join");
    return modelAndView;
}

@RequestMapping(value = "join",method = RequestMethod.POST)
@ResponseBody
public ModelAndView memberInsert(MemberVO memberVO) throws Exception{
        memberService.insertMember(memberVO);
        modelAndView.setViewName("main");
//       return "id ="+ memberVO.getId()+"\t"+"password = "+ memberVO.getPassword()+"\t"+"name = "+ memberVO.getName()+"\t"
//               +"phoneNumber = "+ memberVO.getPhoneNumber()+"email = "+memberVO.getEmail()+"gender = "+memberVO.getGender();
    return modelAndView;
}

@RequestMapping(value = "login",method = RequestMethod.GET)
public ModelAndView loginWrite(){
        modelAndView.setViewName("member/login");
        return modelAndView;
}

    @RequestMapping(value = "loginTest",method = RequestMethod.POST)
    @ResponseBody
    public String loginInsert(LoginVO loginVO) throws Exception{
        return "id : "+loginVO.getId()+"\t"+"password : "+loginVO.getPassword();
    }



}
