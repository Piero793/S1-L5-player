package it.epicode.main;

import it.epicode.interfacce.Luminosità;
import it.epicode.interfacce.Play;
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
        Multimedia video2 = new Video("Java tutorial", 100, 10, 8);
        Multimedia audio = new Audio("Messaggio Vocale", 20, 10);
        Multimedia immagine = new Immagine("Logo Epicode", 10);
        Multimedia immagine2 = new Immagine("Logo Azienda", 5);

        Multimedia[] arrayMultimedia = {video, audio, video2, immagine, immagine2};

        int scelta = -1;

        while (true) {
            System.out.println("Seleziona l'elemento (da 0 a " + (arrayMultimedia.length - 1) + "):");
            for (int i = 0; i < arrayMultimedia.length; i++) {
                System.out.println(i + ": " + arrayMultimedia[i].toString());
            }
            System.out.println("6: Esci dal programma");
            int indice = input.nextInt();

            if (indice == 6) {
                System.out.println("Arrivederci!");
                break;
            }

            if (indice < 0 || indice >= arrayMultimedia.length) {
                System.out.println("Indice non valido!");
                continue;
            }

            Multimedia elemento = arrayMultimedia[indice];

            if (elemento instanceof Immagine) {
                while (true) {
                    System.out.println("Scegli un'opzione per l'immagine selezionata:");
                    System.out.println("1. Aumenta luminosità");
                    System.out.println("2. Diminuisci luminosità");
                    System.out.println("3. Mostra immagine");
                    System.out.println("4. Torna alla selezione dell'elemento");
                    System.out.println("6. Esci dal programma");
                    int subScelta = input.nextInt();

                    switch (subScelta) {
                        case 1:
                            ((Immagine) elemento).aumentaLuminosita();
                            break;
                        case 2:
                            ((Immagine) elemento).diminuisciLuminosita();
                            break;
                        case 3:
                            ((Immagine) elemento).show();
                            break;
                        case 4:
                            System.out.println("Torno alla selezione dell'elemento.");
                            break;
                        case 6:
                            System.out.println("Arrivederci!");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Scelta non valida!");
                            break;
                    }
                    if (subScelta == 4) {
                        break;
                    }
                }
            } else {
                while (true) {
                    System.out.println("Scegli un'opzione per l'elemento selezionato:");
                    System.out.println("1. Aumenta luminosità");
                    System.out.println("2. Diminuisci luminosità");
                    System.out.println("3. Alza volume");
                    System.out.println("4. Abbassa volume");
                    System.out.println("5. Avvia l'elemento con le modifiche");
                    System.out.println("6. Torna alla selezione dell'elemento");
                    System.out.println("7. Esci dal programma");
                    int subScelta = input.nextInt();

                    switch (subScelta) {
                        case 1:
                            if (elemento instanceof Luminosità) {
                                ((Luminosità) elemento).aumentaLuminosita();
                            } else {
                                System.out.println("Nessun controllo sulla luminosità.");
                            }
                            break;
                        case 2:
                            if (elemento instanceof Luminosità) {
                                ((Luminosità) elemento).diminuisciLuminosita();
                            } else {
                                System.out.println("Nessun controllo sulla luminosità.");
                            }
                            break;
                        case 3:
                            if (elemento instanceof Volume) {
                                ((Volume) elemento).alzaVolume();
                            } else {
                                System.out.println("Nessun controllo sul volume.");
                            }
                            break;
                        case 4:
                            if (elemento instanceof Volume) {
                                ((Volume) elemento).abbassaVolume();
                            } else {
                                System.out.println("Nessun controllo sul volume.");
                            }
                            break;
                        case 5:
                            if (elemento instanceof Play) {
                                ((Play) elemento).play();
                            } else {
                                System.out.println("Questo elemento non può essere avviato.");
                            }
                            break;
                        case 6:
                            System.out.println("Torno alla selezione dell'elemento.");
                            break;
                        case 7:
                            System.out.println("Arrivederci!");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Scelta non valida!");
                            break;
                    }
                }
            }
        }
    }
}
