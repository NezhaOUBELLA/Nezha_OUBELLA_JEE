package com.example.tp3jpaap.repositories;

import com.example.tp3jpaap.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
