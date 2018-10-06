import Dishes.Dish;
import Menus.DailyMenu;
import Menus.WeekMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayList<User> usersOfFirstKitchen = new ArrayList<>(0);
        ArrayList<User> usersOfSecondKitchen = new ArrayList<>(0);
        ArrayList<User> usersOfThirdKitchen = new ArrayList<>(0);

        int numberOfKitchens = 3;
        ArrayList<Kitchen> kitchens = new ArrayList<Kitchen>(numberOfKitchens);

        for(int i=0; i<numberOfKitchens; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Name of Current Kitchen: ");
            String nameOfCurrKitchen = sc.nextLine();

            int workingDays = 5;
            ArrayList<DailyMenu> dailyMenus = new ArrayList<>(workingDays);
            for(int j=0; j < workingDays; j++) {

                String nameOfDish;
                short gramsOfDish ;

                System.out.println("Day " + (j+1));
                System.out.println("Name Of Brekfast: " );
                nameOfDish = sc.nextLine();
                System.out.println("Grams: ");
                gramsOfDish = sc.nextShort();
                sc.nextLine();
                Dish brekfast = new Dish(nameOfDish, gramsOfDish);

                System.out.println("Name Of Lunch: " );
                nameOfDish = sc.nextLine();
                System.out.println("Grams: ");
                gramsOfDish = sc.nextShort();
                sc.nextLine();
                Dish lunch = new Dish(nameOfDish, gramsOfDish);

                System.out.println("Name Of Dinner: " );
                nameOfDish = sc.nextLine();
                System.out.println("Grams: ");
                gramsOfDish = sc.nextShort();
                sc.nextLine();
                Dish dinner = new Dish(nameOfDish, gramsOfDish);

                dailyMenus.add(new DailyMenu(brekfast, lunch, dinner));
            }

            kitchens.add(new Kitchen(nameOfCurrKitchen, new WeekMenu(dailyMenus)));
        }

        kitchens.get(0).AddNewUser(new User("Ivan", "Dimitrov", "1111111111"));
        for(Kitchen k : kitchens) {
            System.out.println(k.toString());
        }
    }
}
