package main;

import owner.HomePage;
import util.Login;
import passenger.Homepage;

/*
Collapse (hide) a block                     Ctrl + Minus
Collapse (hide) a block                     Ctrl + NumPad Minus

Collapse (hide) all code blocks             Ctrl + Shift + NumPad Minus
Expand all code blocks (expand-all-folds)   Ctrl + Shift + NumPad Plus

Expand a Collapsed Block (expand-fold)      Ctrl + Plus
Expand a Collapsed Block (expand-fold)      Ctrl + NumPad Plus
Expand a Collapsed Block (expand-fold)      Ctrl + Equals
Expand all code blocks (expand-all-folds)   Ctrl + Shift + Plus
Expand all code blocks (expand-all-folds)   Ctrl + Shift + Equals
 */
 /*
  Database details:
-------------------------
hostname: 35.240.151.216
port: 3306
username: root
pass: root
connectionName: jatraServer
 */
public class JatraBegins {

    private static int key;
    private static String user;
    private static passenger.Homepage passenger_homepage;

    private static owner.HomePage owner_homepage;
    private static boolean CURRENT_SESSION = false;

    public static void main(String[] args) {
        //entry point of program
        new Login().setVisible(true);

        // new AddressAPI().findAddressFromQuery("kala");
    }

    public static Homepage getPassenger_homepage() {
        return passenger_homepage;
    }

    public static void setPassenger_homepage(Homepage passenger_homepage) {
        JatraBegins.passenger_homepage = passenger_homepage;
    }

    public static void setKey(int _key) {
        key = _key;
        System.out.println("current session key set to : " + key);
    }

    public static void setUser(String _user) {
        user = _user;
        System.out.println("type of user session: " + user);
    }

    public static String getUser() {
        return user;
    }

    public static int getKey() {
        return key;
    }

    public static HomePage getOwner_homepage() {
        return owner_homepage;
    }

    public static void setOwner_homepage(HomePage owner_homepage) {
        JatraBegins.owner_homepage = owner_homepage;
    }

    public static boolean isCURRENT_SESSION() {
        return CURRENT_SESSION;
    }

    public static void setCURRENT_SESSION(boolean CURRENT_SESSION) {
        JatraBegins.CURRENT_SESSION = CURRENT_SESSION;
    }

}
