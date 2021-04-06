public class CheckingAccount extends BankAccount {
    
    //Declaring instance variables
    private final static double fee=0.15;

    //Parameterized constructor
    public CheckingAccount(String name,double amount) {
        super(name,amount);
        super.setAccountNumber(getAccountNumber()+"-10");
    }
    

    //This method will deduct the Monthly fee
  public boolean withdraw(double amount)
  {
      boolean b=false;
      if(amount>100 && getBalance()+fee>=amount)
      {
          super.withdraw(amount+fee);
        System.out.printf("After withdrawl of $%.2f, balance = %.2f\n",amount,getBalance());
          b=true;  
      }
      else if(getBalance()>=amount)
      {
         
         super.withdraw(amount+fee);
            System.out.printf("After withdrawl of $%.2f, balance = %.2f\n",amount,getBalance());
          b=true;
      }
      else
      {
          b=false;
          
      }
      return b;
  }
    

}