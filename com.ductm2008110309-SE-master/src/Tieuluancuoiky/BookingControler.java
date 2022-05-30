package Tieuluancuoiky;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class BookingControler {

    private RoomHotel roomHotel;

    public RoomHotel getdiachi() {
        return roomHotel;
    }

    public void bookroom(String diachi) {
        String tempMemory = RoomHotel.getDiachi();
        int index = -1;
        // 1. Đặt phòng
        if (diachi.equals(this.getdiachi())) {
            System.out.println("danh sách phòng" + tempMemory);

        } else if (this.roomHotel.getDiachi() != null && this.roomHotel.getDiachi().equals(diachi)) {
            System.out.println("Bạn đã đặt phòng ở đây rồi, bạn có muốn đặt thêm không?");
            // JsonObject jsonObject = tempMemory.get(index).getAsJsonObject();

        }
    }

    @Override
    public String toString() {
        return "BookingControler [roomHotel=" + roomHotel + "]";
    }

}
