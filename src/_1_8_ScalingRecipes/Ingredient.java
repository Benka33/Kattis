package _1_8_ScalingRecipes;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

//class for the Ingredients
public class Ingredient {

    public String name;
    public double weight;
    public double percent;
    //Format for having US decimal standard so that there is only one decimal
    private DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(new Locale("en", "US"));

    public Ingredient(String name, double weight, double percent) {
        this.name = name;
        this.weight = weight;
        this.percent = percent;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPercent() {
        return percent;
    }

    @Override
    public String toString() {
        //applying the format in the toString
        df.applyPattern("#.0");
        return name + " " + df.format(weight);
    }

}
