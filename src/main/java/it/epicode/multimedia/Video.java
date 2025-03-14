package it.epicode.multimedia;

import it.epicode.interfacce.Luminosità;
import it.epicode.interfacce.Volume;

public class Video extends Multimedia implements Volume, Luminosità {


    public Video(String titolo, int durata, int volume) {
        super(titolo, durata, volume);
    }

    private int luminosita;

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        this.luminosita = luminosita;
    }

    @Override
    public void play() {
        // ripeto per un numero di volte pari alla durata la stampa del titolo concatenato con ! di lunghezza pari al volume e poi una sequenza di * pari alla luminosità
        for (int i = 0; i < getDurata() / 2; i++) {
            System.out.println(getTitolo() + "!".repeat(getVolume()) + "*".repeat(getLuminosita()));
        }
    }

    @Override
    public void aumentaLuminosita() {
        setLuminosita(getLuminosita() + 1);
    }

    @Override
    public void diminuisciLuminosita() {
        setLuminosita(getLuminosita() - 1);
    }

    @Override
    public void alzaVolume() {
        setVolume(getVolume() + 1);
    }

    @Override
    public void abbassaVolume() {
        setVolume(getVolume() - 1);
    }
}
