package com.devtalles.tu_cv_spring_boot.cv.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cv")
public class SkillsController {

  @GetMapping("/skills")
  public String getSkills(Model model){
    List<String> skills = List.of("Java", "Springboot", "NodeJS", "HTML", "CSS");
    List<String> list = new ArrayList<>();
    model.addAttribute("skills", skills);
    return "skills";
  }
}
