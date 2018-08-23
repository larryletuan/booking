package com.toshiba.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "comtoshibaweb")
public class TestClient {
    @RequestMapping(value="/trang-chu",method = RequestMethod.GET)
     public ModelAndView homePage()
    {
        ModelAndView mav = new ModelAndView("web/home");
        mav.addObject("welcome","Welcome Client");
        return mav;
    }


}

