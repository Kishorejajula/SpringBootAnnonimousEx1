package com.app.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	/*@Bean
	public CommandLineRunner c1() {
		return new CommandLineRunner() {
	*/		
	@Bean
	public CommandLineRunner c2() {
		return args->System.out.println("from 8 Runner");
		
			/*@Override
			public void run(String... args) throws Exception {
				//System.out.println("from 7 Runner");
				
			}
		};*/
		
	}

}
