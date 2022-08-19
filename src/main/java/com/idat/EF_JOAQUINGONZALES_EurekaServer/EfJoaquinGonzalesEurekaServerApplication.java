package com.idat.EF_JOAQUINGONZALES_EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EfJoaquinGonzalesEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfJoaquinGonzalesEurekaServerApplication.class, args);
	}

}
