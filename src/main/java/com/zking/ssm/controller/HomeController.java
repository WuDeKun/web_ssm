package com.zking.ssm.controller;

import com.zking.ssm.model.Module;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@Controller
@RequestMapping("/home")
public class HomeController {
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
