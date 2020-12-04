package Problimaitic;
import java.util.Scanner;

public class Problimatic {

    public static void printOut(int livre, int number_c_b, int wallet , int number_tickit){

         System.out.println("Livre et Fournitures : "+ livre +"MAD");
         System.out.println("Vous pouvez ensuite acheter :");
         System.out.println(number_c_b + " cofe");
         System.out.println(number_c_b + " Carte de recharge prépayer");
         System.out.println(number_tickit + " billets de TRAME");
         System.out.println("et il vous restera "+ wallet +" MAD pour les roses blanches.");


    }


        public static void calac_pro() {

            Scanner price = new Scanner(System.in);

            System.out.print("Combien avez-vous reçu d'argent (MAD) ? : ");
            int price_initial = price.nextInt();

            int livre_Fournitures = (int)(price_initial * 0.75);

            int wallet = price_initial - livre_Fournitures;

            int number_cofe_billet = (wallet / 3) / 10;

            int number_tickit = (wallet / 3) / 8;

            wallet = 2 * ((wallet / 3) % 10) +  (wallet / 3) % 8 + wallet % 3;

            printOut(livre_Fournitures, number_cofe_billet, wallet, number_tickit);



        }







}
