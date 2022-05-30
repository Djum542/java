package Tieuluancuoiky;

import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class StoredFile {
    private String storedFile;
    private JsonArray memory;

    public StoredFile(String storedFile, JsonArray memory) {
        this.storedFile = storedFile;
        this.memory = read();
    }

    public int search(String key, String value) {
        // duyet danh sách
        int index = -1;
        String diachi = null;
        for (int i = 0; i < memory.size(); i++) {
            JsonObject jsonObject = memory.get(i).getAsJsonObject();
            diachi = jsonObject.get(key).getAsString();
            if (value.equals(diachi)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public JsonArray read() {
        JsonArray jsonArray = null;
        try (FileReader reader = new FileReader(storedFile)) {
            jsonArray = (JsonArray) JsonParser.parseReader(reader);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return jsonArray;
    }

    public void update(String gia, String tienich, String diachi, String dientich, String sophong) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("G", gia);
        jsonObject.addProperty("T", tienich);
        jsonObject.addProperty("AD", diachi);
        jsonObject.addProperty("S", dientich);
        jsonObject.addProperty("N", sophong);
        memory.add(jsonObject);
        // memory add
    }

    public void write() {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(storedFile)) {
            gson.toJson(memory, writer);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public JsonArray getAll() {
        return this.memory;
    }
}
