package Problimaitic;

import java.util.Scanner;

public class Problimatic {



    public static void calac_pro(){
        final int Cofe_Teckit = 28;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the amount (DH): ");
        int montant = input.nextInt();

        int moneyForSchool = (int) (montant * 0.75);

        int wallet = montant - moneyForSchool;

        wallet = wallet - Cofe_Teckit;

        System.out.println("Your moeny for school : " + moneyForSchool + "DH");
        System.out.println("The somme (Cafés, Carte de recharge prépayer , Billets de TRAME) :" + Cofe_Teckit + "DH");
        if (wallet >= 0){
            System.out.println("And you still have " + wallet + "DH, to buy your mother some flowers");
        }else {
            System.out.println("You don't have any money left.");

        }








    }
}
