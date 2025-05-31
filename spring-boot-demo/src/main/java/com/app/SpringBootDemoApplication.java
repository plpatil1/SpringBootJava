package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

@SpringBootApplication(scanBasePackages = {"p1.p2","com.app"})
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
		/*
		 * SpringApplication app = new
		 * SpringApplication(SpringBootDemoApplication.class);
		 * app.setApplicationStartup(new BufferingApplicationStartup(2048));
		 * app.run(args);
		 */
	}

}

/*@SpringBootApplication:
	@AutoConfiguration
	@ComponentScan
	@Configuration
*/