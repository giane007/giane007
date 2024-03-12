#include <stdio.h>
#include <stdlib.h>

#define MAX_DIMENSIONE 100 // Dimensione massima del vettore

void separa_pari_dispari(const int v[], int dimensione, int pari[], int dispari[], int *dim_pari, int *dim_dispari) {
    *dim_pari = 0;
    *dim_dispari = 0;

    for (int i = 0; i < dimensione; i++) {
        if (v[i] % 2 == 0) {
            pari[*dim_pari] = v[i];
            (*dim_pari)++;
        } else {
            dispari[*dim_dispari] = v[i];
            (*dim_dispari)++;
        }
    }
}

void stampa_vettore(const int v[], int dimensione) {
    printf("[ ");
    for (int i = 0; i < dimensione; i++) {
        printf("%d ", v[i]);
    }
    printf("]\n");
}

int main() {
    int vettore[MAX_DIMENSIONE];
    int dimensione;

    printf("Inserisci la dimensione del vettore: ");
    scanf("%d", &dimensione);

    if (dimensione > MAX_DIMENSIONE || dimensione <= 0) {
        printf("Dimensione non valida.\n");
        return 1;
    }

    printf("Inserisci %d numeri interi:\n", dimensione);
    for (int i = 0; i < dimensione; i++) {
        scanf("%d", &vettore[i]);
    }

    int pari[MAX_DIMENSIONE];
    int dispari[MAX_DIMENSIONE];
    int dim_pari, dim_dispari;

    separa_pari_dispari(vettore, dimensione, pari, dispari, &dim_pari, &dim_dispari);

    printf("Numeri pari: ");
    stampa_vettore(pari, dim_pari);

    printf("Numeri dispari: ");
    stampa_vettore(dispari, dim_dispari);

    return 0;
}
