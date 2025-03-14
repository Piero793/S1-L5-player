package it.epicode.multimedia;

import lombok.Data;

@Data
public abstract class Multimedia {
    private String titolo;
    private int durata;
     private int volume;
     public abstract void play();

     public Multimedia(String titolo, int durata, int volume) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
    }


}
