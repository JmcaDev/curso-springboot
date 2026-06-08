package com.devtalles.tu_cv_spring_boot.cv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devtalles.tu_cv_spring_boot.cv.model.Person;


@Controller
@RequestMapping("/cv")
public class CvController {

  @GetMapping({"/index", "", "/"})
  public String index(Model model){
    Person person = new Person("Jose", "Castillo", "Backend Developer");
    model.addAttribute("name", "Jo");
    model.addAttribute("person", person);
    return "index";
  }

}
