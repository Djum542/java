package src;


import java.util.List;

public class AccountTest {
    public static void main(String[] args) {
        List<Object> list = AccountTest.accountValid("mrdam", "damdan@gmail.com");
        AccountTest.createAccount("mrdam", "damdd", "damdan@gmail.com");
        System.out.println(list.get(0) + "#######" + list.get(1));
        AccountTest account = new AccountTest();
        account.Login("mr ha", "haddp");
    }

    private void Login(String string, String string2) {
    }

    private static void createAccount(String string, String string2, String string3) {
    }

    private static List<Object> accountValid(String string, String string2) {
        return null;
    }
}
