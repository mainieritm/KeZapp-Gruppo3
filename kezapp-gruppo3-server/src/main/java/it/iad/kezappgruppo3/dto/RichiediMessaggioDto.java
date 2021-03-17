package it.iad.kezappgruppo3.dto;

public class RichiediMessaggioDto {

    private String sessione;

    public RichiediMessaggioDto() {
    }

    public RichiediMessaggioDto(String sessione) {
        this.sessione = sessione;
    }

    public String getSessione() {
        return sessione;
    }

    public void setSessione(String sessione) {
        this.sessione = sessione;
    }
}
