package it.iad.kezappgruppo3.service;

import it.iad.kezappgruppo3.dto.InviaMessaggioDto;
import it.iad.kezappgruppo3.dto.RegistrazioneDto;
import it.iad.kezappgruppo3.dto.RichiediMessaggioDto;
import org.springframework.stereotype.Service;

public interface MessaggioService {

    RegistrazioneDto inviaTutti(InviaMessaggioDto dto);
    RegistrazioneDto inviaUno(InviaMessaggioDto dto);
    RegistrazioneDto aggiorna(RichiediMessaggioDto dto);
}
