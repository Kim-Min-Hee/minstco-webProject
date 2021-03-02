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



@RequestMapping("/member/")
@Controller
public class MemberController  {

    @Autowired
    MemberService memberService;

    @RequestMapping(value = "join",method = RequestMethod.GET)
public ModelAndView memberWrite(){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("member/join");
    return modelAndView;
}

@RequestMapping(value = "joinCheck",method = RequestMethod.POST)
@ResponseBody
public String memberInsert(MemberVO memberVO) throws Exception{
        memberService.insertMember(memberVO);
       return "id ="+ memberVO.getId()+"\t"+"password = "+ memberVO.getPassword()+"\t"+"name = "+ memberVO.getName()+"\t"
               +"phoneNumber = "+ memberVO.getPhoneNumber()+"email = "+memberVO.getEmail()+"gender = "+memberVO.getGender();
}

@RequestMapping(value = "login",method = RequestMethod.GET)
public ModelAndView loginWrite(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("member/login");
        return modelAndView;
}

    @RequestMapping(value = "loginTest",method = RequestMethod.POST)
    @ResponseBody
    public String loginInsert(LoginVO loginVO) throws Exception{
        return "id : "+loginVO.getId()+"\t"+"password : "+loginVO.getPassword();
    }



}