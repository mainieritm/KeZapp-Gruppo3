package it.iad.kezappgruppo3.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Messaggio implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String testo;

    @Column
    private String destinatario;

    @Column
    private String mittente;

    public Messaggio() {
    }

    public Messaggio(String testo, String destinatario, String mittente) {
        this.testo = testo;
        this.destinatario = destinatario;
        this.mittente = mittente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMittente() {
        return mittente;
    }

    public void setMittente(String mittente) {
        this.mittente = mittente;
    }
}
