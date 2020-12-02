package Collections;

import java.util.*;

public class Collections {


    private static void collection_1(){
        System.out.println("ArrayList :");
        List<String> theMonths = Arrays.asList("January", "February", "March","April", "May", "June", "July", "August", "September ", "October", "November ", "December");
        ArrayList<String> months = new ArrayList<>();
        months.addAll(theMonths);

        for (String month:months) {
            System.out.println(month + " / ");
        }
        System.out.println("the third itmes in the list : " + months.get(2));
        System.out.println("Item number 5 : " + months.get(5));

        //5.	Avec la liste de l'exercice, modifier le mois de aout pour lui ajouter l'accent manquant.
        months.set(6, "JULY");

        //6.	Insérer un élément dans la liste à la première position.
        months.set(0, "JANUARY");

        //7.	Supprimer le troisième élément de cette liste.
        months.remove(2);

        //Rechercher un élément dans cette liste
        months.contains("March");

        //10.	Copier cette liste dans une autre
        ArrayList<String> allMonths = new ArrayList<>();
        allMonths.addAll(months);

        //11.	Cloner la liste dans une autre liste
        ArrayList<String> monthOfYear = allMonths;

        //12.	Tester cette liste est vide ou non
        if(monthOfYear.size() != 0){
            System.out.println("this list not empty !");
        }else{
            System.out.println(" this list is empty!");
        }


    }

    private  static void collection_2(){
        System.out.println("HashSet :");
        //13.	Créer une HashSet de mois, ajouter le nom des douze mois de l'année et afficher HashSet
        HashSet<String>  months = new HashSet<>(Arrays.asList("January", "February", "March","April", "May", "June", "July", "August", "September ", "October", "November ", "December"));
         //15.	Parcourir tous les éléments de HashSet
        for (String month : months) {
            System.out.print(month + " / ");
        }
        //16.	Obtenir le nombre d'éléments dans un ensemble de HashSet
        System.out.println("size of this HashSet is : " + months.size());
        //17.	Vider cette HashSet
        months.clear();
        //18.	Tester que cette HashSet est vide ou non
        if(months.size() == 0){
            System.out.println("this HashSet is empty!!");
        }else{
            System.out.println("this hashSet isn't empty!");
        }

    }


    private static void collection_3(){
        System.out.println("HashMap : ");
        //19.	Écrivez un programme Java pour associer une valeur spécifiée à une clé spécifiée dans une HashMap.
        ArrayList<String>  AllMonths = new ArrayList<>(Arrays.asList("January", "February", "March","April", "May", "June", "July", "August", "September ", "October", "November ", "December"));
        HashMap<Integer,String> months = new HashMap<Integer, String>();
        for(int i = 0; i < 12; i++){
            months.put(i + 1, AllMonths.get(i));
        }

        //20.	Donner la taille de cette HashMap
        System.out.println("the size of this HashMap is : " + months.size());
//21.	Copier tous les éléments de cette HashMap dans une autre
        HashMap<Integer, String> new_months = months;
        //22.	Supprimer un élément spécifié de cette HashMap
        new_months.remove(12);



    }

    public static void main(){
       collection_1();
        collection_2();
        collection_3();

    }

}
