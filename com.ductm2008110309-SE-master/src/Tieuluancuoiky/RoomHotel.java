package Tieuluancuoiky;

import com.google.gson.JsonArray;

public class RoomHotel {
    private double gia;
    private double dientich;
    private static String diachi;
    private boolean tienich;
    private String sophong;
    private boolean bookroom;

    public RoomHotel(double gia, double dientich, String diachi, boolean tienich) {
        this.gia = gia;
        this.dientich = dientich;
        this.diachi = diachi;
        this.tienich = tienich;
        this.sophong = sophong;
    }

    public boolean checkBookRoom() {
        return bookroom;
    }

    public static String getDiachi() {
        return diachi;
    }

    public static void setDiachi(String diachi) {
        RoomHotel.diachi = diachi;
    }

    @Override
    public String toString() {
        return "RoomHotel [diachi=" + diachi + ", dientich=" + dientich + ", gia=" + gia + ", sophong=" + sophong
                + ", tienich=" + tienich + "]";
    }

}
