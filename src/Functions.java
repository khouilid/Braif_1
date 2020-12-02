public class Functions {


    static boolean exercice1(){
        return true;
    }


    static String exercice2 (String str){
        return str;
    }


    static String exercice3 (String str1, String str2){
        return str1 + str2;
    }


    static String exercice4 (int Num1, int Num2){
        if (Num1>Num2){
            return "Le premier nombre est plus grand ";
        }
        if (Num1<Num2){
            return "Le premier nombre est plus petit ";
        }
        if (Num1==Num2){
            return "Les deux nombres sont identique ";
        }

        return null;
    }


    static String exercice5 (String ageStr, int ageInt){
        return ageStr + " " + ageInt;

    }


    static String exercice6 (String Nom, String Prenom, int Age){
        return "My Name Is " +Prenom + " " + Nom + ", And i have " + Age;

    }


    static String exercice7 (String Sex, int age){
        if (Sex.equalsIgnoreCase("homme") && age>=18){
            return "Vous etes un homme et vous etes Majeur";
        }
        if (Sex.equalsIgnoreCase("homme") && age<=18){
            return "Vous etes un homme et vous etes Mineur";
        }
        if (Sex.equalsIgnoreCase("femme") && age>=18){
            return "Vous etes une femme et vous etes Majeur";
        }
        if (Sex.equalsIgnoreCase("femme") && age<=18){
            return "Vous etes une femme et vous etes Mineur";
        }

        return  "Votre input est invalid";

    }


    static int exercice8 (int Par1, int Par2, int Par3){
        return (Par1 + Par2 + Par3);

    }
    static int exercice8 (int Par1, int Par2){
        return exercice8( Par1, Par2, 5);
    }
    static int exercice8 (int Par1){
        return exercice8( Par1, 3);
    }
    static int exercice8 (){
        return exercice8( 2);
    }




    public static void main(String[] args) {

        System.out.println(exercice1());
        System.out.println(exercice2("CUP OF JAVA"));
        System.out.println(exercice3("My name is ", "Soufiane EL Kadiri"));
        System.out.println(exercice4(7, 7));
        System.out.println(exercice5("My age is", 21));
        System.out.println(exercice6("EL Kadiri", "Soufiane", 21));
        System.out.println(exercice7("Homme", 18));
        System.out.println(exercice8(3,8));
    }
}
