package _1_8_ScalingRecipes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ScalingRecipes {

    public void scalingRecipe(){
        //Scanner for inputs
        Scanner scan = new Scanner(System.in);
        ArrayList<Ingredient> ingredientArrayList = null;
        int cases = scan.nextInt();

        //loop for number of cases
        for (int a = 0; a < cases; a++){
            System.out.println("Recipe # " + (a+1));
            //Arraylist of the Ingredient class
            ingredientArrayList = new ArrayList<>();
            //double that will store the main ingredients final weight
           double mainWeight = 0;
           // take inputs
           int nbrIngredients = scan.nextInt();
           double portions = scan.nextInt();
           double desired = scan.nextInt();
           scan.nextLine();
           //The scaling factor for the recipe
           double scalingFactor = desired / portions;
           for (int b = 0; b < nbrIngredients; b++){
               //create the ingredients in format of String, float, float
               String ing = scan.nextLine();
               List<String> divide = Arrays.asList(ing.split(" "));
               //find the ingredient with percentage==100
               if (Float.valueOf(divide.get(2)) == 100){
                    mainWeight = Float.valueOf(divide.get(1)) * scalingFactor;
                   ingredientArrayList.add(new Ingredient(divide.get(0), mainWeight, Float.valueOf(divide.get(2))));
                   //Math.round(mainWeight)
               } else {
                   ingredientArrayList.add(new Ingredient(divide.get(0), Float.valueOf(divide.get(1)), Float.valueOf(divide.get(2))));
               }
           }
                // loop through ingredientArrayList calc the new weight then print it
            for (Ingredient i: ingredientArrayList){
                i.setWeight(mainWeight * (i.getPercent() / 100));

                System.out.println(i.toString());

            }

            System.out.println("----------------------------------------");
        }

    }

}
