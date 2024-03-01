#include <stdio.h>

int main() {
    int N;

   
    printf("Inserisci la lunghezza del vettore: ");
    scanf("%d", &N);

    while (N <= 0) {
        printf("La lunghezza del vettore deve essere maggiore di zero. Reinserisci: ");
        scanf("%d", &N);
    }

    int numeri[N];

    for (int i = 0; i < N; i++) {
        do {
            printf("Inserisci il numero %d: ", i + 1);
            scanf("%d", &numeri[i]);
            
            if (numeri[i] <= 0) {
                printf("Reinserisci un numero maggiore di zero\n");
            }
        } while (numeri[i] <= 0);
    }

    int sommatot = 0, sommapari = 0, sommadispari = 0, conteggiotot = 0, conteggiopari = 0, conteggiodispari = 0, maxpari, minpari, maxdispari, mindispari;

    
    maxpari = minpari = (numeri[0] % 2 == 0) ? numeri[0] : 0;
    maxdispari = mindispari = (numeri[0] % 2 != 0) ? numeri[0] : 0;

    
    for (int i = 0; i < N; i++) {
        sommatot += numeri[i];
        conteggiotot++;
        
        if (numeri[i] % 2 == 0) {
            sommapari += numeri[i];
            conteggiopari++;
            
            
            if (numeri[i] > maxpari) {
                maxpari = numeri[i];
            }
            if (numeri[i] < minpari) {
                minpari = numeri[i];
            }
        } else {
            sommadispari += numeri[i];
            conteggiodispari++;
            
            
            if (numeri[i] > maxdispari) {
                maxdispari = numeri[i];
            }
            if (numeri[i] < mindispari) {
                mindispari = numeri[i];
            }
        }
    }

   
    float mediatot = (float)sommatot / conteggiotot;
    //float mediapari = (conteggiopari > 0) ? (float)sommapari / conteggiopari : 0;
    //float mediadispari = (conteggiodispari > 0) ? (float)sommadispari / conteggiodispari : 0;

    printf("\nMedia totale: %.2f\n", mediatot);
    //printf("Media numeri pari: %.2f\n", mediapari);
    //printf("Media numeri dispari: %.2f\n", mediadispari);

   
    printf("\nMassimo numeri pari: %d\n", maxpari);
    printf("Minimo numeri pari: %d\n", minpari);
    printf("Massimo numeri dispari: %d\n", maxdispari);
    printf("Minimo numeri dispari: %d\n", mindispari);
}
