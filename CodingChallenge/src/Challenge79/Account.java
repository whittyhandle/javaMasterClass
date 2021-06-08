package CodingChallenge.src.Challenge79;

public class Account {

    private String accountNum;
    private double balance;
    private String name;
    private String email;
    private String phoneNum;

    public Account(String accountNum, double balance, String name, String email, String phoneNum) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public void deposit(double depositAmt){
        this.balance = this.balance + depositAmt;
        System.out.println("You deposited: $" + depositAmt);
        System.out.println("Your new balance is: $" + this.balance);
    }

    public void withdrawal(double withdrawalAmt){
        if(this.balance - withdrawalAmt < 0) {
            System.out.println("Insufficient account balance. Withdrawal denied.");
        } else {
            System.out.println("You withdrew: $" + withdrawalAmt);
            System.out.println("Your new balance is: $" + (this.balance - withdrawalAmt));
        }
        
        // Alternative way to do the above code
        //final double remainingBalance = this.balance - withdrawalAmt;

		//String output = this.name + ", " + "you "
				//+ (remainingBalance < 0 ? "have insufficient funds"
						//: "withrew $" + withdrawalAmt + " and have a remaining balance of $" + remainingBalance)
				//+ " in your account \n";
		//System.out.println(output);
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
