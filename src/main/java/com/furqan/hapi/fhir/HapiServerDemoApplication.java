package com.furqan.hapi.fhir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class HapiServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HapiServerDemoApplication.class, args);
    }

//    @Bean
//    ServletRegistrationBean servletRegistrationBean() {
//        return new ServletRegistrationBean(new HapiFhirServer(), "/fhir/r4/*");
//    }
}
