package src;

import java.util.ArrayList;
import java.util.List;

public class NewAccountControler {
    private static final String username = null;
    private static final String email = null;
    private Account account;

    public NewAccountControler(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void createAccount() {
        // listcheck valid username, email
        List<Object> listcheck;
        listcheck = accountvalid(username, email);
        if (!(boolean) listcheck.get(0)) {
            System.out.println(listcheck.get(1));
        } else {
            ((StoredFile) Account.getAccount()).update("username", "email");
            ((StoredFile) Account.getAccount()).write();
        }
    }

    private List<Object> accountvalid(String username, String email) {
        List<Object> list = new ArrayList<>();
        int index = -1;
        index = ((Account) Account.getAccount()).search("username", "email");
        if (index != -1) {
            list.add(false);
            list.add("tai khoan da ton tai");
            list.add("email da ton tai");
        } else {
            list.add(true);
            list.add("Tai khoan da duoc tao");
        }
        return list;
    }

    @Override
    public String toString() {
        return "NewAccountControler [account=" + account + "]";
    }

}
