package sample.OrdersPacage;

import java.util.ArrayList;
import java.util.Objects;

public class Food extends ArrayList<String> {
    private String nameFood;
    ArrayList<sample.OrdersPacage.Ingridient> ingridients;
    private String descriptionFood;
    private Integer calories;
    private Integer cookingTimeFood;
    public static sample.OrdersPacage.Ingridient ingridient;




    @Override
    public String toString() {
        return "Food{" +
                "nameFood='" + nameFood + '\'' +
                ", ingridients=" + ingridients +
                ", descriptionFood='" + descriptionFood + '\'' +
                ", calories=" + (this.calories<0? "unknown":calories) +
                ", cookingTimeFood=" + (this.cookingTimeFood<0? "unknown":this.cookingTimeFood) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;
        Food food = (Food) o;
        return getNameFood().equals(food.getNameFood()) && getIngridients().equals(food.getIngridients()) && Objects.equals(getDescriptionFood(), food.getDescriptionFood()) && getCalories().equals(food.getCalories()) && getCookingTimeFood().equals(food.getCookingTimeFood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameFood(), getIngridients(), getDescriptionFood(), getCalories(), getCookingTimeFood());
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public  ArrayList<sample.OrdersPacage.Ingridient> getIngridients() {
        return ingridients;
    }

    public void setIngridients(ArrayList<sample.OrdersPacage.Ingridient> ingridients) {
        this.ingridients = ingridients;
    }

    public String getDescriptionFood() {
        return descriptionFood;
    }

    public void setDescriptionFood(String descriptionFood) {
        this.descriptionFood = descriptionFood;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        if (calories > 0) {
            this.calories = calories;
        } else this.calories = -1;
    }

    public Integer getCookingTimeFood() {
        return cookingTimeFood;
    }

    public void setCookingTimeFood(Integer cookingTimeFood) {
        if (cookingTimeFood>0){
        this.cookingTimeFood = cookingTimeFood;
        }
        else {this.cookingTimeFood = -1;}
    }
        public Food (Food food){
        this.nameFood = food.nameFood;
        this.ingridients = food.ingridients;
        this.descriptionFood = food.descriptionFood;
        this.calories = food.calories;
        this.cookingTimeFood = food.cookingTimeFood;

    }
    public Food(String nameFood, ArrayList<sample.OrdersPacage.Ingridient> ingridients, String descriptionFood, Integer calories, Integer cookingTimeFood) {
        this.nameFood = nameFood;
        this.setIngridients(ingridients) ;

        this.descriptionFood = descriptionFood;
        this.setCalories(calories);
        this.setCookingTimeFood(cookingTimeFood);
    }
    public Food(String nameFood, String descriptionFood, Integer calories,Integer cookingTimeFood,
                String...ingridients ) {
        this.nameFood = nameFood;
        this.ingridients = new ArrayList<>();
        /*for (String ingridient:ingridients){
            ((ArrayList<Ingridient>) this.ingridients).add(ingridient);
       */
        this.descriptionFood = descriptionFood;
        this.calories = calories;
        this.cookingTimeFood = cookingTimeFood;
    }}

