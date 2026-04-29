class tasks {
    public static void main(String[] args) {
        samp o=new samp();
        o.add();
        
    System.out.println(o.a);  
    System.out.println(samp.b);  
    }
}
class samp{
    int a=30;
    static int b=21;
    void add(){
        final int c = 10;
        int a=10;
        System.out.println(a);
        System.out.println(c);
    }
}  