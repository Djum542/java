package Tieuluancuoiky;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookroomUI {
    private static final String booroomControler = null;
    private BookingControler bookingControler;
    private Action command;
    private static Scanner in = new Scanner(System.in);

    public BookroomUI(BookingControler bookingControler, String command) {
        this.bookingControler = bookingControler;
        this.command = null;
    }

    // Lắng nghe yêu cầu từ khách hàng
    public String handlCommand(String rep) {
        String cmd = rep.toUpperCase();
        this.command = Action.valueOf(cmd);
        if (this.command.equals(Action.BK)) {
            return "Địa chỉ";
        } else {
            return "Không yêu cầu này là gì";
        }

    }

    // Nơi khách hàng nhập dữ liệu từ bàn phím vào
    public String handlInput() {
        if (this.command.equals(Action.BK)) {
            List<Object> list = BookroomInput();
            // this.booroomControler.bookroom(list.get(0), list.get(1));
        } else {
            System.out.println("Mời quý khách chọn chức năng");
        }
        return null;

    }

    private List<Object> BookroomInput() {
        List<Object> list = new ArrayList<>();
        System.out.println("Nơi bạn muốn đến?/n Where are you go?");
        String diachi = in.nextLine();
        list.add(diachi);
        return list;
    }
}
