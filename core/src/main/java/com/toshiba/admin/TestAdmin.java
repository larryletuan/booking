package com.toshiba.admin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value="comtoshibaadmin")
public class TestAdmin {

    @RequestMapping(value = "/admin",method = RequestMethod.GET)
     public ModelAndView homePage()
    {
        ModelAndView mav=new ModelAndView("admin/home");
        mav.addObject("welcome","welcome admin");
        return mav;
    }
}
