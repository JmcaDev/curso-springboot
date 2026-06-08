package com.devtalles.tu_cv_spring_boot.cv.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devtalles.tu_cv_spring_boot.cv.model.Person;

@RestController
@RequestMapping("/api")
public class CvApiController {

  @GetMapping("/cv")
  public Person getPerson(){
    return new Person("Jose", "Castillo", "Backend Developer");
  }

}
