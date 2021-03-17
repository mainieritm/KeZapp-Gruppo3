package it.iad.kezappgruppo3.dto;

import it.iad.kezappgruppo3.model.Chat;
import it.iad.kezappgruppo3.model.Messaggio;
import java.util.List;

public class RegistrazioneDto {

    private List<Chat> contatti;
    private List<Messaggio> messaggi;
    private String sessione;

    public RegistrazioneDto() {
    }

    public RegistrazioneDto(List<Chat> contatti, List<Messaggio> messaggi, String sessione) {
        this.contatti = contatti;
        this.messaggi = messaggi;
        this.sessione = sessione;
    }

    public List<Chat> getContatti() {
        return contatti;
    }

    public void setContatti(List<Chat> contatti) {
        this.contatti = contatti;
    }

    public List<Messaggio> getMessaggi() {
        return messaggi;
    }

    public void setMessaggi(List<Messaggio> messaggi) {
        this.messaggi = messaggi;
    }

    public String getSessione() {
        return sessione;
    }

    public void setSessione(String sessione) {
        this.sessione = sessione;
    }
}
