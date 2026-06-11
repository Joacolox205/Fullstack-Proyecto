package cl.duocuc.dbenvio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 🎯 @EnableDiscoveryClient - Registra este servicio en Eureka
 * 🎯 @EnableFeignClients - Habilita las llamadas entre microservicios
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DbEnvioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbEnvioApplication.class, args);
	}

}