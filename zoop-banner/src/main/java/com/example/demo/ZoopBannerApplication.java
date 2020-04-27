package com.example.demo;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ZoopBannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZoopBannerApplication.class, args);
		//SpringApplicationBuilder builder = new SpringApplicationBuilder(ZoopBannerApplication.class);
		//builder.bannerMode(Mode.OFF);
		//SpringApplication application = builder.build();
		//application.run(args);
	}

}
