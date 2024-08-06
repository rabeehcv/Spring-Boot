package com.personal.auditingTask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AuditingTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuditingTaskApplication.class, args);
	}

}
