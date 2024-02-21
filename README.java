
import java.util.Scanner;

public class PositiviPari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la dimensione dell'array:");
        int dimensione = scanner.nextInt();

        int[] numeri = new int[dimensione];

        System.out.println("Inserisci i numeri:");

        for (int i = 0; i < dimensione; i++) {
            numeri[i] = scanner.nextInt();
        }

        if (tuttiPositiviPari(numeri)) {
            System.out.println("Tutti positivi e pari.");
        } else {
            System.out.println("NO");
        }
    }

    // Metodo per verificare se tutti i numeri in un array sono positivi e pari
    private static boolean tuttiPositiviPari(int[] array) {
        for (int numero : array) {
            if (numero <= 0 || numero % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
