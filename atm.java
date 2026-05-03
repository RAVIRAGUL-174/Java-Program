import java.util.Scanner;
public class atm {
    public static void main(String[] args){
        int pin = 2006 , inp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your pin : ");
        inp = scan.nextInt();
        if(inp == pin){
            db obj = new db();
            do { 
                System.out.println("1.Check Balance\n2.Withdraw\n3.Deposit\n4.Exit");
                System.out.print("Enter your choice : ");
                int choice = scan.nextInt();
                if(choice == 1){
                    obj.displayBalance();
                }
                else if(choice == 2){
                    System.out.print("Enter the amount to withdraw : ");
                    double amt = scan.nextDouble();
                    System.out.println("Balance : " + obj.withdraw(amt));
                }
                else if(choice == 3){
                    System.out.print("Enter the amount to deposit : ");
                    double amt = scan.nextDouble();
                    System.out.println("Balance : "+obj.deposit(amt));
                }
                else if(choice == 4){
                    System.out.println("Thank you for using our services");
                    break;
                }
                else{
                    System.out.println("Invalid choice");
                }
            } while (true);
        }else{
            System.out.println("Invalid pin");
        }
        
    }
}

class db{
    private double balance;

    void displayBalance(){
        System.out.println("Your balance is : " + balance);
    }
    double withdraw(double amt){
        if(amt > balance){
            System.out.println("Insufficient balance");
            return balance;
        }
        else{
            balance -= amt;
            System.out.println("Withdrawn : " + amt);
            return balance;
        }
    }
    double deposit(double amt){
        balance += amt;
        System.out.println("Deposit amount : " + amt);
        return balance;
    }
}