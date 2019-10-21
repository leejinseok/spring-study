package com.example.app;

import com.example.app.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(AppProperties.class)
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    String profile = System.getProperty("spring.profiles.active");
    if(profile == null) {
      System.setProperty("spring.profiles.active", "dev");
    }

    SpringApplication.run(Application.class, args);
  }
}
