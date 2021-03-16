package com.minstco.controller.member;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import com.minstco.service.MemberService;
import com.minstco.vo.LoginVO;
import com.minstco.vo.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;


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

@ResponseBody
@RequestMapping(value = "idCheck" , method = RequestMethod.POST)
    public String idCheck (MemberVO memberVO) throws Exception {
    System.out.println("controller : "+memberVO.getId());
   int result =  memberService.idCheck(memberVO);
    return String.valueOf(result);
}


@RequestMapping(value = "join",method = RequestMethod.POST)
@ResponseBody
public ModelAndView memberInsert(MemberVO memberVO) throws Exception {
            try {
                memberService.insertMember(memberVO);
                modelAndView.addObject("result","success");
                modelAndView.addObject("message","가입 축하드립니다.");
                modelAndView.addObject("data",memberVO.getName());
            }catch (Exception e){
                modelAndView.addObject("result","failed");
                modelAndView.addObject("message","가입이 실패하셨습니다.");
            }

        modelAndView.setViewName("main");
    return modelAndView;
}

@RequestMapping(value = "login",method = RequestMethod.GET)
public ModelAndView loginWrite(){
        modelAndView.setViewName("member/login");
        return modelAndView;
}

@RequestMapping(value = "loginCheck", method = RequestMethod.POST)
public ModelAndView loginCheck(@ModelAttribute MemberVO memberVO , HttpSession session){
    System.out.println(memberVO.getId());
        boolean result =memberService.loginCheck(memberVO,session);
    if (result == true) {
        modelAndView.setViewName("main");
        modelAndView.addObject("msg","success");
    }else{
        modelAndView.setViewName("member/login");
        modelAndView.addObject("msg","failed");
    }
    return modelAndView;
}

    @RequestMapping(value = "loginTest",method = RequestMethod.POST)
    @ResponseBody
    public String loginInsert(LoginVO loginVO) throws Exception{
        return "id : "+loginVO.getId()+"\t"+"password : "+loginVO.getPassword();
    }



}
