package Menus;

import Exceptions.DailyMenuIsExistsException;

import java.util.ArrayList;

public class WeekMenu {
    private ArrayList<DailyMenu>  menu;

    public WeekMenu(ArrayList<DailyMenu>  menu) {
        for (int i=1;i<menu.size();i++)
            if(isExist(menu.get(i),menu,i)) {
                try {
                    throw new DailyMenuIsExistsException("Menu is repeated");
                } catch (DailyMenuIsExistsException e) {
                    e.printStackTrace();
                }
            }

        this.menu = menu;
    }

    public String toString() {
        String str="";
        for(DailyMenu currMenu : menu) {
            str += currMenu.toString() + '\n';
        }
        return str;
    }

    private boolean isExist(DailyMenu menu1, ArrayList<DailyMenu> menu, int cnt) {
        for(DailyMenu currMenu : menu) {
            if(menu1.equals(currMenu))
                return true;
        }
        return false;
    }
}
