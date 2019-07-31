package com.stackroute.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller//this tells that this is a controller classfor dispatcher servelet
public class HelloWorldController {

    @RequestMapping("/")//for mappint the http request from the dipacther servelet
    public ModelAndView getGreetings(){
      ModelAndView modelAndView=new ModelAndView();
      modelAndView.addObject("result","naveen");
      modelAndView.setViewName("result");
      return modelAndView;
    }
}
