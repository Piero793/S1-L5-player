package it.epicode.multimedia;

import lombok.Data;

@Data
public abstract class Multimedia {
    private String titolo;
    private int durata;
    private int volume;
    private int luminosita;


    public Multimedia(String titolo, int durata, int volume, int luminosita) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public Multimedia(String titolo, int durata, int volume) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
    }

    public Multimedia(String titolo, int luminosita) {
        this.titolo = titolo;
        this.luminosita = luminosita;
    }
}
