package it.iad.kezappgruppo3.service;

import it.iad.kezappgruppo3.dto.RegistrazioneDto;
import it.iad.kezappgruppo3.dto.RichiediRegistrazioneDto;
import org.springframework.stereotype.Service;

public interface ChatService {
    RegistrazioneDto registrazione(RichiediRegistrazioneDto dto);
}
