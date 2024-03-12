#include <stdio.h>

#define DIMENSIONE 5 // Dimensione dei vettori

void somma_vettori(const int v1[], const int v2[], int somma[], int dimensione) {
    for (int i = 0; i < dimensione; i++) {
        somma[i] = v1[i] + v2[i];
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
    int vettore1[DIMENSIONE] = {1, 2, 3, 4, 5};
    int vettore2[DIMENSIONE] = {6, 7, 8, 9, 10};
    int vettore_somma[DIMENSIONE];

    somma_vettori(vettore1, vettore2, vettore_somma, DIMENSIONE);

    printf("Vettore 1: ");
    stampa_vettore(vettore1, DIMENSIONE);

    printf("Vettore 2: ");
    stampa_vettore(vettore2, DIMENSIONE);

    printf("Vettore somma: ");
    stampa_vettore(vettore_somma, DIMENSIONE);

    return 0;
}
