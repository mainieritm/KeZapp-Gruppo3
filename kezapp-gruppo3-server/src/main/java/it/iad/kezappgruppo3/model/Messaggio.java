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

    public Messaggio(String testo, String aliasDestinatario, String aliasMittente) {
        this.testo = testo;
        this.destinatario = aliasDestinatario;
        this.mittente = aliasMittente;
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

    public String getAliasDestinatario() {
        return destinatario;
    }

    public void setAliasDestinatario(String aliasDestinatario) {
        this.destinatario = aliasDestinatario;
    }

    public String getAliasMittente() {
        return mittente;
    }

    public void setAliasMittente(String aliasMittente) {
        this.mittente = aliasMittente;
    }
}
