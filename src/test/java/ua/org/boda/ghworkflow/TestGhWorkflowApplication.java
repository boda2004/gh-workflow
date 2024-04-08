package ua.org.boda.ghworkflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestGhWorkflowApplication {

  public static void main(String[] args) {
    SpringApplication.from(GhWorkflowApplication::main)
        .with(TestGhWorkflowApplication.class)
        .run(args);
  }
}
