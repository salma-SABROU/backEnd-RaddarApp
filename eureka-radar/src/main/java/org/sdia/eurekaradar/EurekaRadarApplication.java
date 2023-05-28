package org.sdia.eurekaradar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaRadarApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRadarApplication.class, args);
    }

}
