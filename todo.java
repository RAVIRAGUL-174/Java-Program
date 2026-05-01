import java.util.*;

 class todo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your task:");
        String task = sc.nextLine();
        todo1 t = new todo1();
        t.mn(task);
    }
}
class todo1{
void mn(String b){
    if(b.isBlank()){

        System.out.println("Enter your task: ");
        return;
    }
    else{
        System.out.println("Your task is: "+b);
        System.out.println("Thank you for entering");
    }
}

}