package com.minstco.controller.member;

import com.minstco.dao.MemberDAO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import com.minstco.service.MemberService;
import com.minstco.vo.LoginVO;
import com.minstco.vo.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;


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
//    @RequestMapping(value = "idCheck" , method = RequestMethod.POST)
//    @ResponseBody
//    public int  idCheck(@RequestBody MemberVO memberVO) throws Exception{
//        int result = memberService.idCheck(memberVO.getId());
//        return result;
//    }
    @RequestMapping(value = "idCheck" , method=RequestMethod.POST)
public @ResponseBody int idCheck(@RequestParam("id")String id){

        int cnt = memberService.idCheck(id);
        return cnt;
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

    @RequestMapping(value = "loginTest",method = RequestMethod.POST)
    @ResponseBody
    public String loginInsert(LoginVO loginVO) throws Exception{
        return "id : "+loginVO.getId()+"\t"+"password : "+loginVO.getPassword();
    }



}
