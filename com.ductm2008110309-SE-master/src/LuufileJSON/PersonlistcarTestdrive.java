package LuufileJSON;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class PersonlistcarTestdrive {
    private static List<String> teocars;
    private int persons;

    public static void main(String[] args) {
        List<String> teocars = new ArrayList<>();
        // teocars.add(new Car("Mess", "eh24j7", 255864));
        teocars.add(100, null);
        Gson gson = new Gson();
        JsonObject seat1 = new JsonObject();
        seat1.addProperty("1", 0);
        JsonArray hall = new JsonArray();
        hall.add(seat1);
        Person teocar = new Person("Teo", 24, "lequydon");
        try (FileWriter writer = new FileWriter("persons.json")) {
            gson.toJson(teocars, writer);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
