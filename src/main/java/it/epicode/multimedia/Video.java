package it.epicode.multimedia;

import it.epicode.interfacce.Luminosità;
import it.epicode.interfacce.Play;
import it.epicode.interfacce.Volume;

public class Video extends Multimedia implements Volume, Luminosità, Play {


    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume, luminosita);
    }

    @Override
    public void play() {
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
