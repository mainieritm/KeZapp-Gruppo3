package it.iad.kezappgruppo3.service;

import it.iad.kezappgruppo3.dto.InviaMessaggioDto;
import it.iad.kezappgruppo3.dto.RegistrazioneDto;
import it.iad.kezappgruppo3.dto.RichiediMessaggiDto;
import it.iad.kezappgruppo3.dto.RichiediRegistrazioneDto;
import it.iad.kezappgruppo3.model.Chat;
import it.iad.kezappgruppo3.model.Messaggio;
import java.util.List;

public interface KeZappService {

    RegistrazioneDto registrazione(RichiediRegistrazioneDto dto);
    List<Chat> getContattiList();
    RegistrazioneDto inviaTutti(InviaMessaggioDto dto);
    RegistrazioneDto inviaUno(InviaMessaggioDto dto);
    RegistrazioneDto aggiorna(RichiediMessaggiDto dto);
    List<Messaggio> getMessaggiList(String nickName);
}
