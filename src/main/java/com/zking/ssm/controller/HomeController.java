package com.zking.ssm.controller;

import com.zking.ssm.model.Module;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Locale;

@Controller
//@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/home/index.shtml")
    public String toIndex(HttpSession session){
        session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);
        return "index";
    }

    @RequestMapping("/localeChange")
    public String localeChange(@RequestParam String locale,HttpSession session){
        if("en".equals(locale))
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.US);
        else
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);
        return "index";
    }


    @RequestMapping(value="toHome")
    public String toHome(Module module, HttpServletRequest req,
                               @RequestParam String sex,
                               @RequestParam HashMap<String,Object> params,
                               Model model){
        System.out.println("哎~~~~~呀呀呀呀   呀");
        System.out.println(module);
        System.out.println(sex);
        System.out.println(params);
      /*  ModelAndView mv=new ModelAndView();
        mv.setViewName("welcome");
        mv.addObject("params",params);
        return mv;*/
        model.addAttribute("params",sex);

        return "redirect:toHomeL";
    }
    @RequestMapping(value="toHomeL")
    public String toHomeL(RedirectAttributes model){
        System.out.println(model);
        System.out.println("deesseees老牛老牛了  seesss");

        return "welcome";
    }
}
