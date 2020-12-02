import java.util.Scanner;

public class gestion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("entrer le prix");
        int prix = input.nextInt();
        int qrt = prix/4;
        int rest1=prix%4;
        int achat = qrt*3;
        int total= qrt/3;
        int rest2= qrt%3;
        int cafe= total/10;
        int rest3= total%10;
        int carte= total/10;
        int rest4= total%10;
        int billet= total/8;
        int rest5= total%8;
        int fleur = rest1 +rest2+rest3+rest4+rest5;
        System.out.println(" le prix l'achat de livres et fournitures est : "+ achat+"DH");
        System.out.println("Vous pouvez ensuite acheter :");

        System.out.println("-"+cafe+" cafés.");
        System.out.println("-"+carte+" Carte de recharge prépayer.");
        System.out.println("-"+billet+" billets de TRAME.");
        System.out.println("il vous restera "+ fleur+" MAD pour les roses blanches");

    }

}