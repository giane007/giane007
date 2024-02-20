import java.util.*;
public class EstrazioniLotto {
    public static void main(String[] args) {
        /* dichirazione variabili, scanner e vettori */
        String[] opzioni = {"Estrazioni lotto", "[1] Estrazioni ruota di Venezia", "[2] Giocata utente", "[3] Verifica vincita", "[4] Visualizza giocate"};
        String[] opzioni2 = {"[1] Venezia", "[2] giocatore"};
        int[] player = new int[5];
        int[] verifica = new int[5];
        int scelta;
        Scanner keyboard = new Scanner(System.in);
        Random casuale = new Random();


        do {

            // menu scelta
            scelta = menu(opzioni, keyboard);
            wait(1);


            switch (scelta) {
                case 1:
                    player = inputVal(player, keyboard);
                    break;
                case 2:
                    gioca(keyboard, casuale);
                    break;
                case 3:
                    verifica(player, casuale);
                    break;
                case 4:
                    giocate(player);
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }while(true);
    }

    private static void gioca(Scanner keyboard, Random casuale) {
        int[] userNumbers = new int[5];
        System.out.println("Inserisci i tuoi numeri:");
        userNumbers = inputVal(userNumbers, keyboard);
        int[] randomNumbers = casuale (userNumbers, casuale);
        System.out.println("Numeri generati casualmente per la ruota di Venezia:");
        displayNumbers(randomNumbers);
    }

    private static int[] casuale(int[] vet, Random casuale)
    {
        int check;
        for(int i=0; i<vet.length; i++)
        {
            do {
                check = 0; //azzeramento variabile
                vet[i] = casuale.nextInt(0, 90) + 1;
                for (int k = i - 1; k >= 0; k--) {
                    if (vet[i] == vet[k])
                        check++;
                }
            }while(check!=0);
        }
        return vet;
    }

    private static void verifica(int[] userNumbers, Random casuale) {
        int[] randomNumbers = casuale(userNumbers, casuale);
        System.out.println("Numeri generati casualmente per la verifica:");
        displayNumbers(randomNumbers);

    }

    private static void giocate(int[] player) {
        System.out.println("Giocate totali:");
        displayNumbers(player);
    }

    private static int[] inputVal(int[] vet, Scanner keyboard) {
        int check = 0;
        for (int i = 0; i < vet.length; i++) {
            do {
                check = 0; // azzeramento variabile
                System.out.println("Inserisci il " + (i + 1) + "^ valore: ");
                vet[i] = keyboard.nextInt();
                if (i > 0) {
                    for (int k = i - 1; k >= 0; k--) {
                        if (vet[i] == vet[k])
                            check++;
                    }
                }
            } while (check != 0 || (vet[i] < 1 || vet[i] > 90)); // viene effettuato questo controllo per evitare che ci siano numeri doppi
        }
        return vet;
    }

    private static void displayNumbers(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int menu(String[] opzioni, Scanner keyboard) {
        int scelta;
        do {
            clearScreen();
            System.out.println("=== " + opzioni[0] + " ===");
            for (int i = 1; i < opzioni.length; i++) {
                System.out.println(opzioni[i]);
            }
            System.out.print("Scelta: ");
            scelta = keyboard.nextInt();
            if (scelta < 1 || scelta > opzioni.length - 1) {
                System.out.println("Valore errato. Riprova");
                wait(3);
            }
        } while (scelta < 1 || scelta > opzioni.length - 1);
        return scelta;
    }

    private static void wait(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
