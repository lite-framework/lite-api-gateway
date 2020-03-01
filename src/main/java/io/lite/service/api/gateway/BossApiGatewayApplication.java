package io.lite.service.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BossApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BossApiGatewayApplication.class, args);
	}

}
