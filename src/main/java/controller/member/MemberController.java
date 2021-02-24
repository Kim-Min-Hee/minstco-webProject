package controller.member;

import controller.dao.MemberDAO;
import controller.service.MemberService;
import controller.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/member/")
@Controller
public class MemberController  {

    @Autowired
    public MemberService MemberService;

    @RequestMapping(value = "join",method = RequestMethod.GET)
public ModelAndView memberWrite(){
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.setViewName("member/join");
    return modelAndView;
}
@RequestMapping(value = "joinTest",method = RequestMethod.POST)
@ResponseBody
public String memberInsert(MemberVO memberVO) throws Exception{
       return "id ="+ memberVO.getId()+"\t"+"password = "+ memberVO.getPassword()+"\t"+"name = "+ memberVO.getName()+"\t"+"phoneNumber = "+ memberVO.getPhoneNumber();
}



}
