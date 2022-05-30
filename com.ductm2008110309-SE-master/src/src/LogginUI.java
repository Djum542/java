package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogginUI {
    private static Scanner scanner = new Scanner(System.in);

    private LoginAccountController loginAccountController;
    private Action command;

    /**
     * @param loginAccountController
     * @param command
     */
    public LogginUI(LoginAccountController loginAccountController) {
        this.loginAccountController = loginAccountController;
        this.command = null;
    }

    public String handleCommands(String rep) {
        String cmd = rep.toUpperCase();
        this.command = Action.valueOf(cmd);
        if (this.command.equals(Action.LO)) {
            return "Logging out ...";
        } else if (this.command.equals(Action.LI)) {
            return "Enter a username, a password";
        } else {
            return "Unkown command.";
        }
    }

    public void handleInputs() {
        if (this.command.equals(Action.LI)) {
            // ???code?
            List<Object> list = loginInputs();// Implementations
            this.loginAccountController.login(list.get(0).toString(), (int) list.get(1));// Controller
        } else if (this.command.equals(Action.LO)) {
            this.loginAccountController.logout();// Controller
        }
    }

    private List<Object> loginInputs() {
        List<Object> list = new ArrayList<>();
        System.out.print("USERNAME: ");
        String username = scanner.nextLine();
        System.out.print("PASSWORD: ");
        Integer password = scanner.nextInt();
        scanner.nextLine();
        list.add(username);
        list.add(password);
        return list;
    }
}
