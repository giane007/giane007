import java.util.Scanner;

public class gestioneData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continua = true;

        while (continua) {
            System.out.print("Inserisci la data nel formato ggmmaaaa: ");
            int dataInt = scanner.nextInt();

            // Chiamata al metodo per ottenere giorno, mese e anno
            String[] risultati = crsData(dataInt);

            if (risultati != null) {
                // Stampare i risultati
                System.out.println("giorno = " + risultati[0]);
                System.out.println("mese = " + risultati[1]);
                System.out.println("anno = " + risultati[2]);

                // Chiedi all'utente se desidera reinserire una nuova data
                System.out.print("Vuoi inserire una nuova data? (s/n): ");
                char risposta = scanner.next().charAt(0);

                if (risposta == 'n' || risposta == 'N') {
                    continua = false; // Termina il ciclo
                }
            } else {
                System.out.println("Data inserita non valida. Reinserisci la data.");
            }
        }

        scanner.close();
    }

    // Metodo per ottenere giorno, mese e anno da un valore numerico intero
    public static String[] crsData(int dataInt) {
        int giorno = dataInt / 1000000;        // Ottieni i primi due cifre
        int meseNum = (dataInt / 10000) % 100; // Ottieni le cifre centrali
        int anno = dataInt % 10000;            // Ottieni le ultime quattro cifre

        // Verifica se la data è valida
        if (dataOk(giorno, meseNum)) {
            // Array di stringhe per i nomi dei mesi
            String[] nomiMesi = {"GENNAIO", "FEBBRAIO", "MARZO", "APRILE", "MAGGIO", "GIUGNO",
                    "LUGLIO", "AGOSTO", "SETTEMBRE", "OTTOBRE", "NOVEMBRE", "DICEMBRE"};

            // Ottieni il nome del mese dalla corrispondente posizione nell'array
            String meseStr = nomiMesi[meseNum - 1];

            // Creazione di un vettore per contenere i risultati
            return new String[]{String.valueOf(giorno), meseStr, String.valueOf(anno)};
        } else {
            return null; // La data non è valida
        }
    }

    public static boolean dataOk(int giorno, int mese) {
        int[] giorniDelMese = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Verifica se il mese è valido
        if (mese < 1 || mese > 12) {
            return false;
        }

        // Verifica se il giorno è valido
        if (giorno < 1 || giorno > giorniDelMese[mese - 1]) {
            return false;
        }

        return true;
    }
}
