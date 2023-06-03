package com.ms.sauvegarderdossierservice.repository;

import java.util.Optional;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.sauvegarderdossierservice.entity.Dossier;

import jakarta.transaction.Transactional;

public interface DossierRepository extends JpaRepository<Dossier,Long> {
     @Transactional
     Optional<Dossier> findByMembreIdAndNomDossierAndProjetId(Long membreId,String nomDossier,Long projetId);
     @Transactional
     Optional<List<Dossier>> findByProjetId(Long projetId);
}
