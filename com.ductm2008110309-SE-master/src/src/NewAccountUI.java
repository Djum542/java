package src;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class NewAccountUI {
    private Action comand;
    private NewAccountControler newAccountControler;
    private static Scanner in = new Scanner(System.in);

    public NewAccountUI(String comand, NewAccountControler newAccountControler) {
        this.comand = null;
        this.newAccountControler = newAccountControler;
    }

    public String handlComand(String rep) {
        String cmd = rep.toUpperCase();
        this.comand = Action.valueOf(cmd);
        if (this.comand.equals(Action.CA)) {
            return "Dien ten dang nhap, mat khau";

        } else {
            return "khong hieu lenh ban nhap  la gi";
        }
    }

    public String handlInput() {
        Account account = createAccountInput();
        return null;
    }

    private static Account createAccountInput() {
        System.out.println("USERNAME");
        String username = in.nextLine();
        System.out.println("PASSWOED");
        String password = in.nextLine();
        System.out.println("EMAIL");
        String email = in.nextLine();
        return new Account(username, password, email);
    }

    @Override
    public String toString() {
        return "NewAccountUI [comand=" + comand + ", newAccountControler=" + newAccountControler + "]";
    }

}
