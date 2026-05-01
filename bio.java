import java.util.*;
class bio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your ph.no.:");
        long phoneNumber = sc.nextLong(); 
        System.out.println("Enter email:");
        String email = sc.next();
        System.out.println(name);
        System.out.println(age);
        System.out.println(phoneNumber);
        System.out.println(email);
    
    }
}