//This example shows the possible use
//of Scanner methods, and basic object
//oriented features.
import java.util.Scanner;

//This class defines a basic bank account
class BankAccount{
  String ownerName;
  long accountID;
  double balance;

  //Default constructor that asks for missing information
  BankAccount(){
    Scanner read = new Scanner(System.in);
    this.ownerName = read.next();
    this.accountID = read.nextLong();
    this.balance = read.nextDouble(); 
  }
  //Constructor with parameters
  BankAccount(String name, long accountID, double balance){
    this.ownerName = name;
    this.accountID = accountID;
    this.balance = balance; 
  }
  //Deposit adds an amount to the balance
  public void deposit(double amount){
     this.balance += amount;
  }
  //Withdraw an amount to the balance, 
  //and returns a boolean indicating
  //the success of the operation  
  public boolean withdraw(double amount){
     boolean withdrawn = false;
     if (balance > amount){
       balance -= amount;
       withdrawn = true;
       System.out.println("Amount withdrew succesfully");
    } else {
       System.out.println("Not enough funds");
    }
    return withdrawn;
  }
}


public class MyClass {
  public static void main() {
    Scanner read = new Scanner(System.in);
    String name = read.next();
    long accountID = read.nextLong();
    double initialDeposit = read.nextDouble(); 
    BankAccount ba = new BankAccount(
            name, accountID, initialDeposit); 
    ba.withdraw(read.nextDouble());
  }
    
}
