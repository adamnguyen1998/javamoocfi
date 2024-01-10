import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here

    public void addMeal(String meal){
        if (this.meals.contains(meals)){
            return;
    }
        this.meals.add(meal);
    }


    public void printMeals(){
        for (String food: meals){
            System.out.println(food);
        }

    }

    public void clearMenu(){
        this.meals.clear();

    }
}

public class main {

public static void main(String args[]){

    Menu menu = new Menu();
    menu.addMeal("Tofu ratatouille");
    menu.addMeal("Chilli coconut chicken");
    menu.addMeal("Chilli coconut chicken");
    menu.addMeal("Meatballs with mustard sauce");

    menu.printMeals();
    menu.clearMenu();

    System.out.println();
    menu.addMeal("Tomato and mozzarella salad");
    menu.printMeals();

    }

}
