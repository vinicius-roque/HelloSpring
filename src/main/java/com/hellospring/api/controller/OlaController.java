package com.hellospring.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class OlaController {
  @GetMapping
  public String olaSpring() {
    return "Olá Spring";
  }
}
