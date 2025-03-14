package it.epicode.multimedia;

import it.epicode.interfacce.Luminosità;
import it.epicode.interfacce.Show;


public class Immagine extends Multimedia implements Luminosità , Show {


    public Immagine(String titolo, int luminosita) {
        super(titolo, luminosita);
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
    public void show() {
        System.out.println(getTitolo() + "*".repeat(getLuminosita()));
    }
}
