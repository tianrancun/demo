package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		new SpringApplicationBuilder(DemoApplication.class)
//				.web(WebApplicationType.NONE)
//				.build(args).run();
	}

//	@Bean
	public ApplicationRunner runner(WebServerApplicationContext context){

		return new ApplicationRunner() {
			@Override
			public void run(ApplicationArguments args) throws Exception {
				System.out.println("当前server实现类为"+context.getWebServer().getClass().getName());
				try {
					System.out.println("sleep...");
					Thread.sleep(50000L);
					System.out.println("sleep end...");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	}

}
