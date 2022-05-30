package Tieuluancuoiky;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class BookingControler {

    private static final String BookroomUI = null;
    private RoomHotel roomHotel;

    public RoomHotel getdiachi() {
        return roomHotel;
    }

    public void bookroom(String diachi) {
        String tempMemory = RoomHotel.getDiachi();
        List<Object> listcheck;
        listcheck = roomValid(diachi);
        int index = -1;
        // 1. Đặt phòng
        if (diachi.equals(this.getdiachi())) {
            System.out.println("danh sách phòng" + tempMemory);
            // BookroomUI.BookroomInput();
        } else if (this.roomHotel.getDiachi() != null && this.roomHotel.getDiachi().equals(diachi)) {
            System.out.println("Bạn đã đặt phòng ở đây rồi, bạn có muốn đặt thêm không?");
            // JsonObject jsonObject = tempMemory.get(index).getAsJsonObject();

        }
    }

    private List<Object> roomValid(String diachi) {
        List<Object> list = new ArrayList<>();
        int index = 0;
        // index = RoomHotel.getDiachi().search("dc", diachi);
        if (index != -1) {
            list.add(true);
            list.add("[ room] con phong");
        }
        if (index == -1) {
            list.add(false);
            list.add("[don't room] het phong roi");
        }
        return null;
    }

    @Override
    public String toString() {
        return "BookingControler [roomHotel=" + roomHotel + "]";
    }

}
