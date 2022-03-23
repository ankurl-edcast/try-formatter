package com.example.demo.api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo")
public class DemoController {

  @GetMapping("/update/status")
  public void updateStatus() {

    List<String> nm = Arrays.asList("A", "B", "C", "D");

    Username u = new Username("Z");

    Set<Username> b = new HashSet<Username>();

    b.addAll(
        nm.stream()
            .map(
                username -> {
                  u.setName(username);
                  return u;
                })
            .collect(Collectors.toSet()));

    System.out.println(b.size());
  }
}

class Username {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Username(String name) {
    super();
    this.name = name;
  }
}
