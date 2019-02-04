package package11;

public class Account {
    double RUB;
    String name;
    static double courseUSDtoRUB;

    public static void main(String[] args) {

        Account.courseUSDtoRUB = 67.2;

        Account a1 = new Account();
        a1.name = "Robert";
        a1.RUB = 2000.04;

        Account a2 = new Account();
        a2.name = "Carl";
        a2.RUB = 3000.04;


    }
}
