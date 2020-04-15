package assignment6;

public class Account {
   private double bal;  //The current balance
   private int accnum;  //The account number

   public Account(int a) {
      bal = 0.0;
      accnum = a;
   }

   public void deposit(double sum) {
      if (sum > 0)
         bal += sum;
      else
         System.err.println("Account.deposit(...): " + "cannot deposit negative amount.");
   }
   public void withdraw(double sum) {
      if (sum > 0)
         bal -= sum;
      else
         System.err.println("Account.withdraw(...): " + "cannot withdraw negative amount.");
   }

   public double getBalance() {
      return bal;
   }
   public double getAccountNumber() {
      return accnum;
   }

   public String toString() {
      return "Acc " + accnum + ": " + "balance = " + bal;
   }
   public final void print() {
      //Don't override this
      System.out.println( toString() );
   }
}
class Customer{
   public static void main(String[] args){
         Account user = new Account(1);
         user.deposit(1034);
         user.withdraw(20);//입금보다 많이 출금하면 차액만큼 음수로 표현됨 
         System.out.println(user.getBalance());
         System.out.println(user.getAccountNumber());
         //user.toString();
         user.print();
   }
}
class SavingAccount extends Account{
   public SavingAccount(int a) {super(a);}
   private final double interest_rate = 1.21;
   public double getInterestrat(){
      return interest_rate;
   }
   public double interest(){
       double interest =  getBalance() + getBalance()*interest_rate;//상속메소드를 통해 bal 간접 접근        
      return interest;
   }
}

class StudentAccount extends SavingAccount{
   private int drawlimit;
   public StudentAccount(int a, int drawlimit){
      super(a);
      this.drawlimit = drawlimit;
   }
   @Override
   public double interest(){
      
   }

   

}
class CheckingAccount extends Account{
   public CheckingAccount(int a){super(a);}

 }