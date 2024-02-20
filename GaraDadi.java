import java.util.Random;

public class GaraLancioDelDado {

   public static void main(String[] args) {

       Random valore = new Random();

       int valFaccia= valore.nextInt(0,6)+1;

       int valFaccia2= valore.nextInt(0,6)+1;

       for(int n=1;n<=2;n++){

           for(int i=1; i<=6; i++){

               dado(i);

               attesa(1);

               cls();

           }

           if(n==1){

               attesa(1);

               System.out.println("Al GIOCATORE 1 è uscita la faccia numero " + valFaccia);

               dado(valFaccia);

               System.out.println("Ritiriamo il dado");

           }else{

               attesa(1);

               System.out.println("Al GIOCATORE 2 è uscita la faccia numero " + valFaccia2);

               dado(valFaccia2);

           }

       }

       if(valFaccia>valFaccia2) {

           System.out.println("!!Il GIOCATORE 1 ha vinto la partita!!");

       }else if(valFaccia<valFaccia2){

           System.out.println("!!Il GIOCATORE 2 ha vinto la partita!!");

       }else{

           System.out.println("||PAREGGIO||");

       }

   }

   public static void dado(int faccia){

       switch (faccia){

           case 1: System.out.println("\t\t\t\t ╔════════╗");

                   System.out.println("\t\t\t\t ║        ║");

                   System.out.println("\t\t\t\t ║    0   ║");

                   System.out.println("\t\t\t\t ║        ║");

                   System.out.println("\t\t\t\t ╚════════╝");

                   break;

           case 2: System.out.println("\t\t\t\t ╔════════╗");

                   System.out.println("\t\t\t\t ║0       ║");

                   System.out.println("\t\t\t\t ║        ║");

                   System.out.println("\t\t\t\t ║       0║");

                   System.out.println("\t\t\t\t ╚════════╝");

                   break;

           case 3: System.out.println("\t\t\t\t ╔════════╗");

                   System.out.println("\t\t\t\t ║0       ║");

                   System.out.println("\t\t\t\t ║    0   ║");

                   System.out.println("\t\t\t\t ║       0║");

                   System.out.println("\t\t\t\t ╚════════╝");

               break;

           case 4: System.out.println("\t\t\t\t ╔════════╗");

                   System.out.println("\t\t\t\t ║0      0║");

                   System.out.println("\t\t\t\t ║        ║");

                   System.out.println("\t\t\t\t ║0      0║");

                   System.out.println("\t\t\t\t ╚════════╝");

                   break;

           case 5: System.out.println("\t\t\t\t ╔════════╗");

                   System.out.println("\t\t\t\t ║0      0║");

                   System.out.println("\t\t\t\t ║    0   ║");

                   System.out.println("\t\t\t\t ║0      0║");

                   System.out.println("\t\t\t\t ╚════════╝");

                   break;

           case 6: System.out.println("\t\t\t\t ╔════════╗");

                   System.out.println("\t\t\t\t ║0      0║");

                   System.out.println("\t\t\t\t ║0      0║");

                   System.out.println("\t\t\t\t ║0      0║");

                   System.out.println("\t\t\t\t ╚════════╝");

                   break;

           default:

                   System.out.println("Valore non valido");

                   break;

       }

   }

   public static void attesa(int x) {

       try {

           Thread.sleep(1000*x);

       } catch (InterruptedException e) {

           e.printStackTrace();

       }

   }

   public static void cls() {

       try {

           new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

       } catch (Exception E) {

           System.out.println(E);

       }

   }

}
