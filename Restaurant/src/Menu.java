import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    List<Dish> dishes = new ArrayList<>();
    Scanner keyboard = new Scanner(System.in);

    public void add5dishes (){
        if(dishes.size() == 5) System.out.println("No more dishes can be added. Maximum number reached.");
        else {
            for (int i = 0; i < 5; i++) {

                System.out.print("Enter the name of the dish you want to add to the menu: ");
                String dishName = keyboard.nextLine();
                System.out.print("Enter its price: ");
                Double dishValue = keyboard.nextDouble();
                keyboard.nextLine();

                Dish newDish = new Dish(dishName,dishValue);

                dishes.add(newDish);

                System.out.println("Dish number " + (i+1) + " was successfully created.");
            }
        }
    }

    public void replaceVeganOption(){
        System.out.print("Enter the name of the vegan dish you want to add to the menu: ");
        String dishName = keyboard.nextLine();
        System.out.print("Enter its price: ");
        Double dishValue = keyboard.nextDouble();

        Dish newDish = new Dish(dishName,dishValue);

        dishes.set(2,newDish);

        System.out.println("The vegan dish was successfully changed.");
    }

    public void amountDishes(){
        System.out.println("The number of dishes on the menu is " + dishes.size());
    }

    public void menuList(){
        for (int i = 0; i < dishes.size(); i++) {
            Dish current = dishes.get(i);
            System.out.println(current.getName() + " | " + current.getPrice());
        }
    }
}
