package com.example.app.controller;

import com.example.app.config.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/v1/auth")
public class AuthController {
  @Autowired
  private AppProperties appProperties;


  @GetMapping("/login")
  public Map<String, String> login() {
    Map<String, String> map = new HashMap<>();
    map.put("name", appProperties.getName());

    return map;
  }
}
