package Tieuluancuoiky;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class CreateRoom {
    private static final String room = null;

    public static void main(String[] args) {
        RoomHotel roomHotel = new RoomHotel();
        roomHotel.addProperty(new RoomHotel(1000000, 80, "254 Dương an, 24, Tan Cu, Da Nang", "true", "5A16"));
        roomHotel.addProperty(new RoomHotel(7000000, 60, "132 Chu văn an, 22, Tan Cu, Da Nang ", "false", "12B2"));
        List<RoomHotel> list = new ArrayList<>();
        list.add(roomHotel);
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter("room.json")) {
            gson.toJson(list, writer);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
