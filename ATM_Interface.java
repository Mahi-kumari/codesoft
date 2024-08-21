
import java.util.Scanner;
class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+= amount;
            System.out.println("Deposit successfull" + balance);
        }else{
            System.out.println("Invalid amount for deposit");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdraw successfull:"+ balance);
        }
        else{
            System.out.println("Invalid amount for withdraw");
        }
    }
}
class ATM{
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account){
        this.account=account;
        this.scanner=new Scanner(System.in);
    }
    public void showmenu(){
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. withdraw");
        System.out.println("4. exit");
    }
    public void run(){
        int choice;
        do{
            showmenu();
            System.out.println("Enter Your Choice");
            choice= scanner.nextInt();
            switch(choice){
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using ATM");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while(choice!=4);
    }
    private void checkBalance(){
        System.out.println("Your account balance is"+ account.getBalance());
    }
    private void deposit(){
        System.out.println("Enter the amount to Deposit");
        double amount= scanner.nextDouble();
        account.deposit(amount);
    }
    public void withdraw(){
        System.out.println("Enter the amount to Withdraw");
        double amount= scanner.nextDouble();
        account.withdraw(amount);
    }
}
public class ATM_Interface{
    public static void main (String args[]){
        System.out.println("Welcome to the ATM");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your pin");
        int enteredpin=sc.nextInt();
        BankAccount userAccount=new BankAccount(1000.0);
        ATM atm=new ATM(userAccount);
        atm.run();
    }
}