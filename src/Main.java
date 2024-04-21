
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];
        for (int i = 0; i < elementi.length; i++) {
            int result;
            do {
                System.out.println("Sciegli un opzione da 1 a 3: \nImmagini - 1 \nVideo - 2 \n Audio - 3");
                result = scanner.nextInt();
                if (result < 1 || result > 3) {
                    System.out.println("Hai indicato un opzione non disponibile!");
                }
            }while (result < 1 || result > 3) ;
                scanner.nextLine();
                System.out.println("Titolo del elemento:");
                String title = scanner.nextLine();
                int luminosita;
                int volume;
                int durata;
                switch (result) {
                    case 1:
                        do {
                            System.out.println("Inserisci la luminosita da 1 a 10");
                            luminosita = scanner.nextInt();
                            if (luminosita < 0 || luminosita > 10) {
                                System.out.println("Hai inserito un valore non disponibile");
                            }
                        } while (luminosita < 0 || luminosita > 10);
                        Immagine immagine = new Immagine(title, luminosita);
                        elementi[i] = immagine;
                        break;
                    case 2:
                        do {
                            System.out.println("Inserisci luminosita da 1 a 10");
                            luminosita = scanner.nextInt();
                            if (luminosita < 0 || luminosita > 10) {
                                System.out.println("Hai inserito un valore non disponibile");
                            }
                        }
                        while (luminosita < 0 || luminosita > 10);
                        do {
                            System.out.println("Inserisci un numero positivo");
                            durata = scanner.nextInt();
                            if (durata < 1) {
                                System.out.println("durata non disponibile");
                            }
                        } while (durata < 1);
                        do {
                            System.out.println("Inserisci il volume da 1 a 10");
                            volume = scanner.nextInt();
                            if (volume < 0 || volume > 10) {
                                System.out.println("Valore non disponibile");
                            }
                        } while (volume < 0 || volume > 10);
                        Video video = new Video(title, durata, volume, luminosita);
                        elementi[i] = video;
                        break;
                    case 3:
                        do {
                            System.out.println("Che durata deve avere l'audio? Numero positivo da 1 a quanto desiderato");
                            durata = scanner.nextInt();
                            if (durata < 1) {
                                System.out.println("Devi inserire un numero positivo e diverso da 0");
                            }
                        } while (durata < 1);
                        do {
                            System.out.println("Che volume deve avere l'audio? Numero da 0 a 10");
                            volume = scanner.nextInt();
                            if (volume < 0 || volume > 10) {
                                System.out.println("Devi inserire un numero positivo e che sia compreso tra 0 e 10");
                            }
                        } while (volume < 0 || volume > 10);
                        Audio audio = new Audio(title, durata, volume);
                        elementi[i] = audio;
                        break;
                    default:
                        break;
                }
            }
            int scelta;
            do {
                System.out.println("Scegli uno numero tra 1 e 5 (elementi multimediali creati in precedenza)\nPer terminare" +
                        " il programma digita il numero 0");
                scelta = scanner.nextInt();
                if (scelta == 0) {
                    System.out.println("Hai scelto di terminare il programma");
                } else if (scelta > 0 && scelta <= elementi.length) {
                    System.out.println("Hai scelto il file multimediale chiamato " + elementi[scelta - 1].getTitolo());
                    if (elementi[scelta - 1] instanceof Immagine) {
                        elementi[scelta - 1].show();
                    } else {
                        elementi[scelta - 1].play();
                    }
                } else {
                    System.out.println("Devi inserire un numero tra 1 e 5");
                }

            } while (scelta != 0);
        }
    }



