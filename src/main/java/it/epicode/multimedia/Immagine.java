package it.epicode.multimedia;

import it.epicode.interfacce.Luminosità;
import it.epicode.interfacce.Show;
import lombok.Data;

@Data
public class Immagine implements Luminosità, Show {
    private String titolo;
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        this.titolo = titolo;
        this.luminosita = luminosita;
    }

    @Override
    public void aumentaLuminosita() {

    }

    @Override
    public void diminuisciLuminosita() {

    }

    @Override
    public void show() {
        //stampa il titolo concatenato a una sequenza di * di lunghezza pari alla luminosità
        System.out.println(getTitolo() + "*".repeat(getLuminosita()));
    }
}
