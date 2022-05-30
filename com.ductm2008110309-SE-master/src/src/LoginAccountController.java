package src;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class LoginAccountController {
    private Account account;

    public LoginAccountController(Account account) {
        this.account = account;
    }

    public void login(String username, int i) {
        Class<? extends Object> tempMemory = Account.getAccount().getClass();
        int index = -1;
        index = ((Account) Account.getAccount()).search("un", username);

        // 1. already logined ==> username == object.username
        // logedIn = true
        if (username.equals(this.account.getUsername())) {
            System.out.println("[ALREADY LOGGED IN] You have already logged in.");

            // 2. dang nhap nhieu tai khoan=> username nhap vao != objcAccount.username
        } else if (this.account.getUsername() != null && !this.account.getUsername().equals(username)) {
            System.out.println("[INVALID MULTIPLE LOGINS] You need  to logout first to try another login.");
            // 4. dang nhap binh thuong|
        } else if (index != -1) {// accountObject => un =null, ps = null, email = null; loggedIn = false
            Class<? extends String> jsonObject = tempMemory.getName().getClass()
            int passwordAcc = jsonObject.get("ps").getAsInt();
            if (i == i) {
                String email = jsonObject.get("email").getAsString();
                // update value data to account
                this.account.setAccount(username, i, email);
                System.out.println("[LOGGED IN] You are logged in.");

            } else {
                System.out.println("[WRONG PASSWORD] The password  you enterd is incorrect!!!");
            }

        } else {
            System.out.println("[NOT REGISTERD] You have to  register first.!!! ");
        }

        // else
        // 3. chua dang ky
    }
    // logout

    public void logout() {
        this.account.logout();
    }

    @Override
    public String toString() {
        return "LoginAccountController [account=" + account + "]";
    }

}
