package Menus;

import Dishes.Dish;

public class DailyMenu {
    private Dish brekfast;
    private Dish lunch;
    private Dish dinner;


    public DailyMenu(Dish brekfast, Dish lunch, Dish dinner) {
        this.brekfast = brekfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    public DailyMenu(DailyMenu menu) {
        this(new Dish(menu.brekfast), new Dish(menu.dinner), new Dish(menu.lunch));
    }

    public  DailyMenu() {
        this(new Dish(), new Dish(), new Dish());
    }

    public  String toString() {
        return "[" + this.brekfast + " | " + this.lunch + " | " + this.dinner + "]";
    }

    public boolean equals(DailyMenu other) {
        if (other!=null) {
            int repeat=0;
            if(this.brekfast.getName().equals(other.brekfast.getName()))
                repeat++;
            if(this.lunch.getName().equals(other.lunch.getName()))
                repeat++;
            if(this.dinner.getName().equals(other.dinner.getName()))
                repeat++;
            if(repeat>=2)
                return true;
        }
        return false;
    }
}