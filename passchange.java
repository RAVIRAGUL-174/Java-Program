import java.util.Scanner;

class passchange{     
    public static void main(String args[]){
        String storedUsername = "admin";
        String storedOldPass = "abc123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter old password: ");
        String oldpass = scanner.nextLine();
        

        if(username.equals(storedUsername) && oldpass.equals(storedOldPass))
        {
            System.out.print("Enter new password: ");
            String newpass = scanner.nextLine();

            System.out.print("Confirm new password: ");
            String confirmpass = scanner.nextLine();

            if(newpass.equals(confirmpass))
            {
                storedOldPass = newpass;
                System.out.println("Password changed successfully.");
            }
            else
            {
                System.out.println("New password and confirm password do not match.");
            }
        }
        else
        {
            System.out.println("Username or old password is incorrect. Password was not changed.");
        }

        scanner.close();
    }
}