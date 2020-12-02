package Loops;

import java.util.Arrays;

public class Loops {

    private static void loop_1(){

        System.out.println("Question 1:");
        int i = 1;
        while(i <= 10){
            System.out.print(i + " / ");
            i++;
        }
    }

    private static void loop_2(){
        System.out.println("Question 2:");
       //TODO solve Big-0 problem.
        for (Double i = 1D ; i <= 30; i++){
            for(Double j = 2D; j <= 100 ; j++){
                Double result = (i * j);
                System.out.print(result + " / ");
            }
        }
    }

    private static void loop_3(){
        System.out.println("Question 3:");

        int i = 1;
        while(i < 10){

            System.out.print(i + (i / 2) + " / ");
            i++;
        }
    }
    
    private static void loop_4(){
        System.out.println("Question 4:");
        for(int i = 1 ;i <= 15; i++){
            System.out.println(i);
            System.out.println("We're almost there ...");
        }

    }

    private static void loop_5(){
        System.out.println("Question 5:");
        for(int i = 20 ;i >= 0; i--){
            System.out.println(i);
            System.out.println("It's almost good ...");
        }

    }

    private static void loop_6(){
        System.out.println("Question 6:");
        for(int i = 0 ;i <= 100; i+=15){
            System.out.println(i);
            System.out.println("We're holding the right end ...");
        }

    }

    private static void loop_7(){
        System.out.println("Question 7:");
        for(int i = 200 ;i >= 0; i-=15){
            System.out.println(i);
            System.out.println("Finally ! ! !");
        }

    }

    public static void loops(){
       loop_1();
       loop_2();
       loop_3();
       loop_4();
       loop_5();
       loop_6();
       loop_7();
    }



}
