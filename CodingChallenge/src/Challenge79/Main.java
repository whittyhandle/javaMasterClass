package CodingChallenge.src.Challenge79;

public class Main {

    public static void main(String[] args) {

        Account account1 = new Account("1234", 100.0, "John Doe", "John@Doe.com", "(555)555-5555");
        Account account2 = new Account("5678", 300.0, "Jane Doe", "Jane@Doe.com", "(666)555-5555");

        account1.deposit(100.0);
        account1.withdrawal(50.00);

        account2.deposit(50.0);
        account2.withdrawal(350.0);
    }
}
