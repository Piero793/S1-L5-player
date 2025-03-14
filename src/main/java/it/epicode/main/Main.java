package it.epicode.main;

import it.epicode.interfacce.Luminosità;
import it.epicode.interfacce.Volume;
import it.epicode.multimedia.Audio;
import it.epicode.multimedia.Immagine;
import it.epicode.multimedia.Multimedia;
import it.epicode.multimedia.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Multimedia video = new Video("Dragon-Ball", 10, 5, 5);
        Multimedia audio = new Audio("Messaggio Vocale", 20, 10);
        Immagine immagine = new Immagine("Logo Epicode", 7);
        Multimedia video2 = new Video("Java tutorial", 100, 10, 8);

        Multimedia[] arrayMultimedia = {video, audio,video2};

        int scelta = -1;

        while (scelta != 0) {
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Avvia un elemento specifico");
            System.out.println("2. Aumenta luminosità");
            System.out.println("3. Diminuisci luminosità");
            System.out.println("4. Alza volume");
            System.out.println("5. Abbassa volume");
            System.out.println("0. Esci");
            scelta = input.nextInt();

            if (scelta == 0) {
                System.out.println("Arrivederci!");
                break;
            }

            System.out.println("Seleziona l'elemento (da 0 a " + (arrayMultimedia.length - 1) + "):");
            for (int i = 0; i < arrayMultimedia.length; i++) {
                System.out.println(i + ": " + arrayMultimedia[i].toString());
            }
            int indice = input.nextInt();

            if (indice < 0 || indice >= arrayMultimedia.length) {
                System.out.println("Indice non valido!");
                continue;
            }

            Multimedia elemento = arrayMultimedia[indice];

            switch (scelta) {
                case 1:
                    elemento.play();
                    break;
                case 2:
                    if (elemento instanceof Luminosità) {
                        ((Luminosità) elemento).aumentaLuminosita();
                    } else {
                        System.out.println("Nessun controllo sulla luminosità.");
                    }
                    break;
                case 3:
                    if (elemento instanceof Luminosità) {
                        ((Luminosità) elemento).diminuisciLuminosita();
                    } else {
                        System.out.println("Nessun controllo sulla luminosità.");
                    }
                    break;
                case 4:
                    if (elemento instanceof Volume) {
                        ((Volume) elemento).alzaVolume();
                    } else {
                        System.out.println("Nessun controllo sul volume.");
                    }
                    break;
                case 5:
                    if (elemento instanceof Volume) {
                        ((Volume) elemento).abbassaVolume();
                    } else {
                        System.out.println("Nessun controllo sul volume.");
                    }
                    break;
                default:
                    System.out.println("Scelta non valida!");
                    break;
            }
        }

    }
}
