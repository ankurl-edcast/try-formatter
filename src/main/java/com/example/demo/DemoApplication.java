package com.example.demo;

import java.io.IOException;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang.SerializationUtils;

// @SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) throws URISyntaxException, IOException {

    //		final String username = "ankur.luthra@edcast.com";
    //		final String password = "11107694555583aa839f17f29534e0f210";
    //		JenkinsServer jenkins = new JenkinsServer(new URI("https://build.itpx.one"), username,
    // password);
    //		JobWithDetails job = jenkins.getJob("solar-core-test");

    //		View view = jenkins.getView("QA-Build-View"); // getJob("ALL PROD Frontend Views");
    //		Build lastSuccessfulBuild = job.getLastSuccessfulBuild();

    //		JobWithDetails job = jenkins.getJob("phoenix-test");
    //		job.

    List<String> nm = Arrays.asList("A", "B", "C", "D");

    Username u = new Username("Z");

    Set<Username> b = new HashSet<Username>();

    b.addAll(
        nm.stream()
            .map(
                username -> {
                  Username user = (Username) SerializationUtils.clone(u);
                  user.setName(username);
                  return user;
                })
            .collect(Collectors.toSet()));

    System.out.println(b.size());
  }
}

class Username implements Serializable {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Username(Username username) {
    this(username.getName());
  }

  public Username(String name) {
    super();
    this.name = name;
  }
}
