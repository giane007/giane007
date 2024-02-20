public class media {
    public static void main(String[] args) {
        int[] a = {4, 6, 8, 98, 5, 45, 7, 9};
        int[] b = {90, 76, 45, 26, 3, 1, 0, 9};

        System.out.println("La media è: " + media(a, b));
    }

    private static double media(int[] a, int[] b) {
        int somma1 = 0,somma2 = 0,divisore1 = 0,divisore2 = 0;

        for (int i = 0; i < a.length; i++) {
            somma1 += a[i];
            divisore1++;
        }
        double media1 = (double) somma1 / divisore1;

        for (int i = 0; i < b.length; i++) {
            somma2 += b[i];
            divisore2++;
        }
        double media2 = (double) somma2 / divisore2;
        return (media1 + media2) / 2;
    }
}
