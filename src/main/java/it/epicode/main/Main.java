package it.epicode.main;

import it.epicode.colori.Colori;
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

        System.out.println(Colori.GIALLO.getCodice() + "-------------------------------------------------------------" + Colori.RESET.getCodice());
        System.out.println(Colori.VERDE.getCodice() + "Benvenuto nel programma di gestione di elementi multimediali!" + Colori.RESET.getCodice());
        System.out.println(Colori.GIALLO.getCodice() + "-------------------------------------------------------------" + Colori.RESET.getCodice());

        while (true) {
            System.out.println(Colori.BLU.getCodice() + "Seleziona l'elemento" + Colori.RESET.getCodice());
            for (int i = 0; i < arrayMultimedia.length; i++) {
                System.out.println(Colori.VERDE.getCodice() + i + ": " + arrayMultimedia[i].toString() + Colori.RESET.getCodice());
            }
            System.out.println(Colori.ROSSO.getCodice() + "6: Esci dal programma" + Colori.RESET.getCodice());
            int indice = input.nextInt();

            if (indice == 6) {
                System.out.println(Colori.ROSSO.getCodice() + "Arrivederci!" + Colori.RESET.getCodice());
                break;
            }

            if (indice < 0 || indice >= arrayMultimedia.length) {
                System.out.println(Colori.ROSSO.getCodice() + "Indice non valido!" + Colori.RESET.getCodice());
                continue;
            }

            Multimedia elemento = arrayMultimedia[indice];

            if (elemento instanceof Immagine) {
                while (true) {
                    System.out.println(Colori.BLU.getCodice() + "Scegli un'opzione per l'immagine selezionata:" + Colori.RESET.getCodice());
                    System.out.println(Colori.VERDE.getCodice() + "1. Aumenta luminosità" + Colori.RESET.getCodice());
                    System.out.println(Colori.VERDE.getCodice() + "2. Diminuisci luminosità" + Colori.RESET.getCodice());
                    System.out.println(Colori.VERDE.getCodice() + "3. Mostra immagine" + Colori.RESET.getCodice());
                    System.out.println(Colori.GIALLO.getCodice() + "4. Torna alla selezione dell'elemento" + Colori.RESET.getCodice());
                    System.out.println(Colori.ROSSO.getCodice() + "6. Esci dal programma" + Colori.RESET.getCodice());
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
                            System.out.println(Colori.GIALLO.getCodice() + "Torno alla selezione dell'elemento." + Colori.RESET.getCodice());
                            break;
                        case 6:
                            System.out.println(Colori.ROSSO.getCodice() + "Arrivederci!" + Colori.RESET.getCodice());
                            System.exit(0);
                        default:
                            System.out.println(Colori.ROSSO.getCodice() + "Scelta non valida!" + Colori.RESET.getCodice());
                    }

                    if (subScelta == 4) {
                        break;
                    }
                }
            } else {
                while (true) {
                    System.out.println(Colori.BLU.getCodice() + "Scegli un'opzione per l'elemento selezionato:" + Colori.RESET.getCodice());
                    System.out.println(Colori.VERDE.getCodice() + "1. Aumenta luminosità" + Colori.RESET.getCodice());
                    System.out.println(Colori.VERDE.getCodice() + "2. Diminuisci luminosità" + Colori.RESET.getCodice());
                    System.out.println(Colori.VERDE.getCodice() + "3. Alza volume" + Colori.RESET.getCodice());
                    System.out.println(Colori.VERDE.getCodice() + "4. Abbassa volume" + Colori.RESET.getCodice());
                    System.out.println(Colori.VERDE.getCodice() + "5. Avvia l'elemento con le modifiche" + Colori.RESET.getCodice());
                    System.out.println(Colori.GIALLO.getCodice() + "6. Torna alla selezione dell'elemento" + Colori.RESET.getCodice());
                    System.out.println(Colori.ROSSO.getCodice() + "7. Esci dal programma" + Colori.RESET.getCodice());
                    int subScelta = input.nextInt();

                    switch (subScelta) {
                        case 1:
                            if (elemento instanceof Luminosità) {
                                ((Luminosità) elemento).aumentaLuminosita();
                            } else {
                                System.out.println(Colori.ROSSO.getCodice() + "Nessun controllo sulla luminosità." + Colori.RESET.getCodice());
                            }
                            break;
                        case 2:
                            if (elemento instanceof Luminosità) {
                                ((Luminosità) elemento).diminuisciLuminosita();
                            } else {
                                System.out.println(Colori.ROSSO.getCodice() + "Nessun controllo sulla luminosità." + Colori.RESET.getCodice());
                            }
                            break;
                        case 3:
                            if (elemento instanceof Volume) {
                                ((Volume) elemento).alzaVolume();
                            } else {
                                System.out.println(Colori.ROSSO.getCodice() + "Nessun controllo sul volume." + Colori.RESET.getCodice());
                            }
                            break;
                        case 4:
                            if (elemento instanceof Volume) {
                                ((Volume) elemento).abbassaVolume();
                            } else {
                                System.out.println(Colori.ROSSO.getCodice() + "Nessun controllo sul volume." + Colori.RESET.getCodice());
                            }
                            break;
                        case 5:
                            if (elemento instanceof Play) {
                                ((Play) elemento).play();
                            } else {
                                System.out.println(Colori.ROSSO.getCodice() + "Questo elemento non può essere avviato." + Colori.RESET.getCodice());
                            }
                            break;
                        case 6:
                            System.out.println(Colori.GIALLO.getCodice() + "Torno alla selezione dell'elemento." + Colori.RESET.getCodice());
                            break;
                        case 7:
                            System.out.println(Colori.ROSSO.getCodice() + "Arrivederci!" + Colori.RESET.getCodice());
                            System.exit(0);
                            break;
                        default:
                            System.out.println(Colori.ROSSO.getCodice() + "Scelta non valida!" + Colori.RESET.getCodice());
                    }

                    if (subScelta == 6) {
                        break;
                    }
                }
            }
        }
    }
}
