package com.furqan.hapi.fhir;

import com.furqan.hapi.fhir.configuration.HapiFhirServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@ServletComponentScan
@SpringBootApplication
public class HapiServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HapiServerDemoApplication.class, args);
    }

//    @Autowired
//    HapiFhirServer hapiFhirServer;
//
//    @Bean
//    ServletRegistrationBean servletRegistrationBean() {
//        return new ServletRegistrationBean(hapiFhirServer, "/fhir/r4/*");
//    }
}
