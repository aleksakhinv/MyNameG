package global.goit;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        User user = new User("Vitalii", "Aleksakhin");
        Gson gson = new Gson();
        System.out.println(gson.toJson(user));
    }
}