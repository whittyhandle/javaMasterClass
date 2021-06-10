package Challenge79;

public class Main {

    public static void main(String[] args) {

        Account account1 = new Account("1111", 100.33, "John Doe", "John@Doe.com", "(111)111-1111");
        Account account2 = new Account("2222", 300.00, "Jane Doe", "Jane@Doe.com", "(222)222-2222");
        Account account3 = new Account("3333", 200.01, "Jim Doe", "Jim@Doe.com", "(333)333-3333");
        Account account4 = new Account("4444", 400.00, "Jacob Doe", "Jacob@Doe.com", "(444)444-4444");
        Account account5 = new Account("5555", 500.00, "Jonas Doe", "Jonas@Doe.com", "(555)555-5555");

        account1.deposit(100.0);
        account1.withdrawal(50.00);

        account2.deposit(50.0);
        account2.withdrawal(350.0);
        
        account3.deposit(10.0);
        account3.withdrawal(400.0);
        
        account4.deposit(0.0);
        account4.withdrawal(400.0);
        
        account5.deposit(-100.0);
        account5.withdrawal(-10.0);
        System.out.println(account2.getBalance() + "test test");
    }
}
