package CodingChallenge.src.Challenge79;

public class Account {

    private String accountNum;
    private double balance;
    private String name;
    private String email;
    private String phoneNum;
    private String invalidNum = "Please enter a valid number\n";
	
    public Account() { // default constructor for easier testing
    }


    public Account(String accountNum, double balance, String name, String email, String phoneNum) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public double deposit(double depositAmt) {
	String output = "";

	System.out.println(this.name + "\nYour current balance is: " + balance);

	if (depositAmt < 0) {
	    System.out.println(invalidNum);
	} else {
	    balance = balance + depositAmt;

	    output = "You deposited: $" + depositAmt + "\nYour new balance is: $" + balance + "\n";

	    System.out.println(output);
	}
	    return balance;
	}

	public double withdrawal(double withdrawalAmt) {
	    System.out.println(this.name + "\nYour current balance is: " + this.balance);

	    if (withdrawalAmt > 0.1) {
		balance = balance - withdrawalAmt;

		String output = balance < 0 ? "You have insufficient funds to withdraw: $" + withdrawalAmt + "\n"
				: "You withdrew: $" + withdrawalAmt + "\nYour new balance is: $" + balance + "\n";

		System.out.println(output);
	    } else {
		System.out.println(invalidNum);
	    }
	    return balance;
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

    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
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
