package com.example.slf4j;

import com.example.slf4j.handler.Slf4jHandler;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        //日志标志
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        new Slf4jHandler().start();
    }
}
