package src;

public class Account {
    private String username;
    private String password;
    private String email;
    private boolean loggedIn;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean checkLoggedIn() {
        return loggedIn;
    }

    @Override
    public String toString() {
        return "Account [email=" + email + ", password=" + password + ", username=" + username + "]";
    }

    public static Object getAccount() {
        return null;
    }

    public int search(String string, String string2) {
        return 0;
    }

    public static StoredFile getAccounts() {
        return getAccounts();
    }

    public void logout() {
        this.loggedIn = false;
        this.username = null;
        this.password = null;
        this.email = null;
        System.out.println("[LOGGED_OUT] You have been logged out");
    }

    public void setAccount(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.loggedIn = true;
    }

}
