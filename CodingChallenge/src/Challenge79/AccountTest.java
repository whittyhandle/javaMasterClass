package CodingChallenge.src.Challenge79;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account;

    @BeforeEach
    public void init(){
        account = new Account();

    }

    @org.junit.jupiter.api.Test
    void testDepositPass() {
        int amount = 20;
        double actual = account.deposit(amount);
        double expect = account.getBalance();
        assertEquals(expect, actual, "values do not match");
    }

    @org.junit.jupiter.api.Test
    void withdrawalPass() {
        int amount = 20;
        double balance = account.setBalance(20);
        double withdrawl = account.withdrawal(20);
        double actual = account.getBalance();
        double expect = 0;
        assertEquals(expect, actual, "values don't match");


    }
}
