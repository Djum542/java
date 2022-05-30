package Tieuluancuoiky;

import java.util.Scanner;

public class Bootrap {
    private static final String rep = null;

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        RoomHotel roomHotel = new RoomHotel();
        BookingControler bookingControler = new BookingControler();
        BookroomUI bookroomUI = new BookroomUI(bookingControler);
        System.out.println("Chao mung den voi khach san!!\n (To exit type exit");
        while (true) {
            Thread.sleep(5000);
            displayOpition(bookingControler);
            String resCMD;
            if (rep.toUpperCase().equals(Action.BK)) {
                resCMD = bookroomUI.handlCommand(rep);
                System.out.println(resCMD);
                if (resCMD != null && !resCMD.equals("yeu cau nay la gi")) {
                    bookroomUI.handlInput();
                }
            }
        }

    }

    private static void displayOpition(BookingControler bookingControler) {
        System.out.println("************ MENU ***************");
        String str = "";
        if (!bookingControler.getdiachi().checkBookRoom()) {
            str = "Ban muon dat phong\n" + "[BK] dat phong";
            System.out.println(str);
        }
    }

    public static String getPrompt(BookingControler bookingControler) {
        if (!bookingControler.getdiachi().checkBookRoom()) {
            return "";
        }
        return "dat phong" + bookingControler.getdiachi().getDiachi();

    }
}
