package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo2")
public class DemoController2 {

  @GetMapping("/update/status2")
  public void updateStatus() {}
}
