package com.furqan.hapi.fhir.configuration;

import ca.uhn.fhir.context.FhirContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HapiFhirServerBeanConfiguration {

    @Bean
    FhirContext fhirContextV4(){
        return FhirContext.forR4();
    }
}
