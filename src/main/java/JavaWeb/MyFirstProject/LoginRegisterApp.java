package JavaWeb.MyFirstProject;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LoginRegisterApp {

    HashMap<String, String> db = new HashMap<>();

    public String getAllUsers() {
        return db.toString();
    }


    public String register(String name, String password, String secondPassword) {
        Set<Map.Entry<String, String>> entries = db.entrySet();
        if (!(db.keySet().contains(name) && db.values().contains(password))) {
            db.put(name, password);
            return "You successfully registered";
        } else return "Not successful";
    }

    public String isRegistered(String user, String password) {
        Set<Map.Entry<String, String>> entries = db.entrySet();
        db.put("eltaj", "eltaj");
        boolean result = entries.stream().filter(a -> a.getKey() == user && a.getValue() == password)
                .findFirst().isPresent();
        if (result == true) {
            return "You are logged in";
        } else return "Please try again";
    }


}
