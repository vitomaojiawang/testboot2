package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.oaec.mapper")
@SpringBootApplication
public class App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

}
