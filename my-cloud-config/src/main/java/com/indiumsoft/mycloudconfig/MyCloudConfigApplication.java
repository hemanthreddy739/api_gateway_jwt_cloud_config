package com.indiumsoft.mycloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCloudConfigApplication.class, args);
	}

}
