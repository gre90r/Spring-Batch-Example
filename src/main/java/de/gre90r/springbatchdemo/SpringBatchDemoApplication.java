package de.gre90r.springbatchdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchDemoApplication {

	public static void main(String[] args) {
		System.exit( //SpringApplication.exit() and System.exit() ensure that the JVM exits upon job completion
				SpringApplication.exit(
						SpringApplication.run(SpringBatchDemoApplication.class, args)));
	}

}
