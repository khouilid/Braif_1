package com.khouilid;

import Variables.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //display choices
        String[] exercises = {"1 -> Variables", "2 -> Loops", "3 -> Collections", "4 -> Functions"};
        for (String exercise : exercises){
            System.out.println(exercise);
        }
        //get input value
        Scanner list_input = new Scanner(System.in);
        System.out.print("Please choose a number : ");
        int exe_number = list_input.nextInt();

        //check the user choice and display result
        if(exe_number == 1){
            System.out.println("you choose variables");
            Variables.choice();
            

        }else if(exe_number == 2){
            System.out.println("you choose loop");

        }else if(exe_number == 3){
            System.out.println("you choose collections");

        }else if(exe_number == 4){
            System.out.println("you choose functions");


        }







    }
}
