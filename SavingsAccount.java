public class SavingsAccount extends BankAccount {

    // Declaring instance variables
    private double rate=2.5;
    private static int savingsNumber=0;
    private String accountNumber;

    // Parameterized constructor
    public SavingsAccount(String name,double amount) {
        super(name,amount);
        //super.setAccountNumber(super.getAccountNumber());
        this.accountNumber=super.getAccountNumber()+"-"+savingsNumber;
        savingsNumber++;
    }
    
    public SavingsAccount(SavingsAccount oldAccount,double amount)
    {
        super(oldAccount,amount);
        this.rate = oldAccount.getInterestRate();
        //super.setAccountNumber(super.getAccountNumber());
        this.accountNumber=super.getAccountNumber()+"-"+savingsNumber;
        savingsNumber++;
    }

    // getters
    public double getInterestRate() {
        return rate;
    }

    // This method will calculate the Interest
    public void postInterest() {
        deposit((getBalance() * (getInterestRate()/1200)));
        
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }
    // toString method is used to display the contents of an object inside it
    @Override
    public String toString() {
        System.out.printf("AccountNumber %s has been created for %s \nInitial balance = $%.2f",accountNumber,getOwner(),getBalance());
        return "";
    }

}