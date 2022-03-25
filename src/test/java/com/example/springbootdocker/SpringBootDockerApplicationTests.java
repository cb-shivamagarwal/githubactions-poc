package com.example.springbootdocker;

import com.example.springbootdocker.controllers.TransactionController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringBootDockerApplicationTests {

  @Autowired
  private TransactionController controller;

  @Test
  void contextLoads() throws Exception {
    assertThat(controller).isNotNull();
  }

}
