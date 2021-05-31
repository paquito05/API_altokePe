package com.altokepe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 
 * @author Samuel
 *
 */

@SpringBootApplication(scanBasePackages = {"com.altokepe"})
public class App extends org.springframework.boot.web.servlet.support.SpringBootServletInitializer 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(App.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) 
	{
		return builder.sources(App.class);
	}
}
