package com.example.app.controller;

import com.example.app.config.AppProperties;
import com.example.app.config.AwsProperties;
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
  AppProperties appProperties;

  @Autowired
  AwsProperties awsProperties;

  @GetMapping(path = "/login")
  public Map<String, String> login() {
    Map<String, String> appDetails = new HashMap<>();
    appDetails.put("name", appProperties.getName());
    appDetails.put("key", awsProperties.getKey());
    return appDetails;
  }
}
