package com.github.rodrigocabral78.apiRestFulSpringBootJava17;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("development")
class ApiRestFulSpringBootJava17ApplicationTests {

  @Value("${paginate.per_page}")
  private int perPage;

  @Test
  void contextLoads() {
  }

  @Test
  public void testCarregarContextoDeTeste() {
    assertEquals(25, perPage);
  }

}
