package it.iad.kezappgruppo3.repository;

import it.iad.kezappgruppo3.model.Messaggio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessaggioRepository extends JpaRepository<Messaggio, Long> {
    
}