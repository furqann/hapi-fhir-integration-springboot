package com.furqan.hapi.fhir.provider;

import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.server.IResourceProvider;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.r4.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientProvider implements IResourceProvider {
    @Override
    public Class<? extends IBaseResource> getResourceType() {
        return Patient.class;
    }

    @Search
    public List<Patient> getPatients() {

        final Patient patient = new Patient();
        patient.setId("12345678");

        return List.of(patient);
    }
}
