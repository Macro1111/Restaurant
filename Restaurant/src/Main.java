import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        while (true) {
            System.out.print(
                    """
                            
                            Welcome to your restaurant menu! Please choose an option:
                                
                                1. Add your 5 dishes
                                2. Add the vegan option
                                3. Check the number of dishes
                                4. List of dishes
                            
                                0. Exit
                            
                            Choose an option:"""
            );
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> menu.add5dishes();
                case 2 -> menu.replaceVeganOption();
                case 3 -> menu.amountDishes();
                case 4 -> menu.menuList();
                case 0 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }
}
