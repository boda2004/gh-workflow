package ua.org.boda.ghworkflow;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.GenericContainer;

@SpringBootTest
class GhWorkflowApplicationTests {
  static GenericContainer<?> nginx = new GenericContainer<>("nginx:alpine");

  @BeforeAll
  static void beforeAll() {
    nginx.start();
  }

  @AfterAll
  static void afterAll() {
    nginx.stop();
  }

  @Test
  void contextLoads() {}
}
