package io.henriquels25.openfeign.tests.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenfeignTestsSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenfeignTestsSampleApplication.class, args);
    }

}
