import java.util.Scanner;

public class Metodi {
    public static void main(String[] args) {
        int a, b, metodi;
        Scanner tastiera = new Scanner(System.in);
        System.out.println("DAMMI DUE NUMERI");
        a = tastiera.nextInt();
        b = tastiera.nextInt();

        do{
            System.out.println("===SCEGLI UN OPZIONE===");
            System.out.println("[1] Somma");
            System.out.println("[2] Differenza");
            System.out.println("[3] Moltiplicazione");
            System.out.println("[4] Potenza");
            System.out.println("[5] Divisione");

            metodi = tastiera.nextInt();
            switch (metodi) {
                case 1:
                    System.out.println("La somma è: " + somma(a, b));
                    break;
                case 2:
                    System.out.println("La differenza è: " + differenza(a, b));
                    break;
                case 3:
                    System.out.println("La moltiplicazione: " + moltiplicazione(a, b));
                    break;
                case 4:
                    System.out.println("La potenza è: " + potenza(a, b));
                    break;
                case 5:
                    System.out.println("La divisione è: " + divisione(a, b));
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        }while(true);
    }

    private static int somma(int x, int y) {
        int somma;
        somma = x + y;
        return somma;
    }

    private static int differenza(int x, int y) {
        int differenza;
        differenza = x - y;
        return differenza;
    }

    private static int moltiplicazione(int x, int y) {
        int moltiplicazione;
        moltiplicazione= x * y;
        return moltiplicazione;
    }

    private static int potenza(int x, int y) {
        int potenza = 1;
        for (int i = 0; i < y; i++) {
            potenza = potenza * x;
        }
        return potenza;
    }

    private static double divisione(int x, int y) {
        double risultato = 0;
        if (y != 0) {
            risultato = (double) x / y;
        } else {
            System.out.println("Impossibile dividere per 0");
        }
        return risultato;
    }
}
