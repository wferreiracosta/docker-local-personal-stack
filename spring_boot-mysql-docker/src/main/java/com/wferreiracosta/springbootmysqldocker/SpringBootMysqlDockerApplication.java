package com.wferreiracosta.springbootmysqldocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.wferreiracosta.springbootmysqldocker")
@EntityScan(basePackages = "com.wferreiracosta.springbootmysqldocker.model")
public class SpringBootMysqlDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqlDockerApplication.class, args);
	}

}
