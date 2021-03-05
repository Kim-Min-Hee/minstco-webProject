package com.minstco.controller;

import com.minstco.controller.member.MemberController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {


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
