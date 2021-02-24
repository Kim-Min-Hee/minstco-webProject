package controller;

import controller.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {


    @Autowired
    MemberService memberService;

    @RequestMapping
    public ModelAndView main() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
}

    @RequestMapping(value = "main",method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("main");
        return mav;
    }




}
