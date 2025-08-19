package com.github.rodrigocabral78.apiRestFulSpringBootJava17;

import com.github.rodrigocabral78.apiRestFulSpringBootJava17.utils.PasswordUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiRestFulSpringBootJava17Application {
  @Value("${paginate.per_page}")
  private int perPage;

  @Bean
  public CommandLineRunner commandLineRunner() {
    return args -> {
      System.out.println("### Quantidade de elementos por página = " + this.perPage);

      String passwdEncoded = PasswordUtils.encoderPasswd("123456");
      System.out.println("Senha encodada: " + passwdEncoded);

      passwdEncoded = PasswordUtils.encoderPasswd("123456");
      System.out.println("Senha encodada novamente: " + passwdEncoded);

      System.out.println("Senha válida: " + PasswordUtils.validationPassword("123456", passwdEncoded));
    };
  }

  public static void main(String[] args) {
    SpringApplication.run(ApiRestFulSpringBootJava17Application.class, args);
    System.out.println("API RESTful com Spring Boot e Java 8 - Guia de Referência...");
    System.out.println("API RESTful com Spring Boot e Java 11 - Guia de Referência...");
    System.out.println("API RESTful com Spring Boot e Java 17 - Guia de Referência...");
    System.out.println("API RESTful com Spring Boot e Java 21 - Guia de Referência...");
    System.out.println("API RESTful com Spring Boot e Java 24 - Guia de Referência...");
  }

}
