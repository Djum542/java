package Tieuluancuoiky;

import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

public class StoredFile {
    private String storedFile;
    private JsonArray memory;

    public StoredFile(String storedFile, JsonArray memory) {
        this.storedFile = storedFile;
        this.memory = read();
    }

    public int search(String key, String value) {
        int index = -1;
        String diachi = null;
        for (int i = 0; i < memory.size(); i++) {
            JsonObject jsonObject = (JsonObject) memory.get(i);
            diachi = jsonObject.get(key).getAsString();
            if (value.equals(diachi)) {
                index = i;
                break;
            } else {
                index = 0;
            }
        }
        return index;
    }

    public JsonArray read() {
        JsonArray jsonArray = null;
        try (FileReader reader = new FileReader(storedFile)) {
            jsonArray = JsonReader(reader);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return jsonArray;
    }

    private JsonArray JsonReader(FileReader reader) {
        return null;
    }

    public void update(String username, Integer password, String email) {
        JsonObject jsonObject = new JsonObject();

        // JsonArray jsonArray = new JsonArray();
        // jsonArray.ad

        jsonObject.addProperty("un", username);
        jsonObject.addProperty("ps", password);
        jsonObject.addProperty("email", email);

        memory.add(jsonObject);
        // memory.ad
    }

    public void write() {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(storedFile)) {
            gson.toJson(memory, writer);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public JsonArray getAll() {
        return this.memory;
    }

    @Override
    public String toString() {
        return "StoredFile [memory=" + memory + ", storedFile=" + storedFile + "]";
    }

    public void update(String string, String string2) {
    }

}
