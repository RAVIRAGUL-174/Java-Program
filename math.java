import java.util.*;

 class math {
    public static void main(String[] args) {
        //absolute value
        int n=-50;
        System.out.println(Math.abs(n));

       //rounding
        float a=4.6f;
        System.out.println(Math.round(a));

        //square root
        int c=64;
        System.out.println(Math.sqrt(c));

        //floor, ceil, max
        double x=2.6;
        double y=3.6;
        System.out.println(Math.floor(x));
        System.out.println(Math.ceil(y));
        int v=34;
        int u=45;
        System.out.println(Math.max(v,u));

        //tan, cos, sin
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the angle in degrees:");
        double degree = sc.nextDouble();
        double radian=Math.toRadians(degree);
        double Sinvalue=Math.sin(radian);
        double Cosvalue=Math.cos(radian);
        double Tanvalue=Math.tan(radian);
        System.out.println("Sine value: " + Sinvalue);    
        System.out.println("Cosine value: " + Cosvalue);
        System.out.println("tan: "+Tanvalue);

        //min,max
        int m=90;
        int m1=80;
        System.out.println(Math.min(m,m1));
        System.out.println(Math.max(m,m1));
        
        //random number
        double randomNum = Math.random();
        System.out.println("Random number: "+randomNum);
        
       



    }
}