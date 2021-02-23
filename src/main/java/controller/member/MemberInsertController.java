package controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberInsertController  {

    @RequestMapping(value = "/member/joinTest",method = RequestMethod.POST)
    public ModelAndView memberWrite(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("member/joinTest");
        return modelAndView;
    }

}
