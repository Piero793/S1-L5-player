package it.epicode.multimedia;

import it.epicode.interfacce.Volume;
import lombok.Data;

public class Audio extends Multimedia implements Volume {


    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata, volume);
    }

    @Override
    public void play() {
        if (getDurata() % 2 == 0) {
            for (int i = 0; i < getDurata() / 2; i++) {
                System.out.println(getTitolo() + "!".repeat(getVolume()));
            }
        }
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
