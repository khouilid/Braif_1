package Variables;

import java.util.Scanner;

public class Variables {

    private static void SayHi(){
        Scanner var_input = new Scanner(System.in);
        String userName = var_input.next();
        System.out.println("Nice to meet you " + userName);

    }


    private static void calcTVA() {

        final double TVA = 0.2;
        //get the price
        Scanner var_input = new Scanner(System.in);
        System.out.print("Please enter the product price (DH):");
        Double prince = var_input.nextDouble();

        System.out.print("there is discount? yes/no : ");
        String discount = var_input.next().toLowerCase();
        //check for discount
        if(discount.equals("yes")){
            //calculate the discount
            System.out.print("Enter the discount (DH): ");
            Double percentage = var_input.nextDouble();
            System.out.println("the percentage of this discount is : " + ((percentage * 100)/prince) + "%");
            prince = prince - percentage;
            prince = prince + (prince * TVA);


        }else{
            prince = prince + (prince * TVA);
            System.out.println("No discount has been applied !!");
        }

        System.out.println("Final price is: " + prince + "DH");





    }


    public static void choice(){

        String[] var_list = {"you choose variables, now select the exercise number : " , "1 -> SayHi", "2 -> Calculate TVA"};
        for (String item : var_list){
            System.out.println(item);
        }
        //get input value
        Scanner var_input = new Scanner(System.in);
        System.out.print("Please choose a number : ");
        int var_number = var_input.nextInt();

        if(var_number == 1){
            System.out.println("You choose SayHi.");
            System.out.print("Hi i'm jarvise, what's your name? ");
            //call the method to say hi
            SayHi();
        }else if (var_number == 2){
            System.out.println("You choose Calculate TVA.");
            calcTVA();
        }



    }



}
