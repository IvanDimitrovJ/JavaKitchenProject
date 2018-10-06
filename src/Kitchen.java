import Exceptions.UserAlreadyInOtherKitchenException;
import Menus.WeekMenu;

import java.util.ArrayList;

public class Kitchen {
    private String name;
    private WeekMenu menu;
    private ArrayList<User> users;

    public Kitchen(String name, WeekMenu menu) {
        this.name = name;
        this.menu = menu;
        this.users = new ArrayList<>();
    }

    public String toString() {
        String str =  name + '\n' + menu.toString() + '\n' + "USERS:" + '\n';
        for(User currUser : users) {
            str += currUser.toString();
        }

        return str;
    }

    public void AddNewUser(User newUser) {
        try {
            this.checkIfUserAlreadyExists(newUser);
        } catch (UserAlreadyInOtherKitchenException e) {
            e.printStackTrace();
        }
        users.add(newUser);
    }

    private void checkIfUserAlreadyExists(User newUser) throws UserAlreadyInOtherKitchenException {
        for (int i = 0; i < users.size(); i++) {
            if (newUser.getEgn().equals(users.get(i).getEgn())) {
                throw new UserAlreadyInOtherKitchenException("The User Eats in Other Kitchen.");
              }
        }
    }

}
