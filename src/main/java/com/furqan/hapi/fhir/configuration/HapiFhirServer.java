package com.furqan.hapi.fhir.configuration;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.server.RestfulServer;
import com.furqan.hapi.fhir.provider.PatientProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

//@Component
@WebServlet(urlPatterns = "/fhir/r4/*")
public class HapiFhirServer extends RestfulServer {

    @Autowired
    PatientProvider patientProvider;


    public HapiFhirServer(FhirContext fhirContext) {
        super(fhirContext);
    }

    @Override
    protected void initialize() throws ServletException {
        super.initialize();
        registerProvider(patientProvider);
    }
}
