package com.furqan.hapi.fhir.configuration;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.server.RestfulServer;

import javax.servlet.ServletException;

public class HapiFhirServer extends RestfulServer {

    public HapiFhirServer(){
        super(FhirContext.forR4());
    }

    @Override
    protected void initialize() throws ServletException {
        super.initialize();

    }
}
