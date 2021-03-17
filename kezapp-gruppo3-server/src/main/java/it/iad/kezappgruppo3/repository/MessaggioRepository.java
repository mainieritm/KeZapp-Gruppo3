package it.iad.kezappgruppo3.repository;

import it.iad.kezappgruppo3.model.Messaggio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessaggioRepository extends JpaRepository<Messaggio, Long> {
    
    // query che restituisce la lista messaggi
    List<Messaggio> findByDestinatarioEqualsOrDestinatarioIsNull(String s);
    
}