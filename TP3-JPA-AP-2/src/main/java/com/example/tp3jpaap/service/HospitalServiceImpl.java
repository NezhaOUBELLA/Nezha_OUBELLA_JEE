package com.example.tp3jpaap.service;

import com.example.tp3jpaap.entities.Consultation;
import com.example.tp3jpaap.entities.Medecin;
import com.example.tp3jpaap.entities.Patient;
import com.example.tp3jpaap.entities.RendezVous;
import com.example.tp3jpaap.repositories.ConsultationRepository;
import com.example.tp3jpaap.repositories.MedecinRepository;
import com.example.tp3jpaap.repositories.PatientRepository;
import com.example.tp3jpaap.repositories.RendezVousRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class HospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
