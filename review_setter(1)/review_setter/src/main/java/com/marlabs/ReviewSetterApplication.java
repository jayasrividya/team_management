package com.marlabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"com.marlabs"} , exclude = {JpaRepositoriesAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class ReviewSetterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewSetterApplication.class, args);
	}
}
