package controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Member {

    @RequestMapping(value = "/member/joinMember",method = RequestMethod.GET)
public ModelAndView member(){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("/member/joinMember");
    return modelAndView;
}
}
