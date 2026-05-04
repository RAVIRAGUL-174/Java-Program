class stringexception {
    public static void main(String[] args) {
     // null pointer exception
        // String str=null;
        // try{
        //     System.out.println(str.length());
        // } catch(Exception e) {
        //     System.out.println("Error: String is null");
        // }
     //integer arthematic exception
    //     int a=3;
    //     try{
    //         System.out.println(a/0);
    //     } catch(Exception e) {
    //         System.out.println("Error: Division by zero");
    //     }
    //array index out of bounds exception
        // int arr[]={1,2,3,4,5};
        // try{
        //     System.out.println(arr[10]);
        // } catch(Exception e) {
        //     System.out.println("Error: Array index out of bounds");
        // }
    //array exception
        // Object arr1[]=new String[5];
        // try{
        //     arr1[0]=10;
        // } catch(Exception e) {
        //     System.out.println("Error: Array store exception");
        // }  
        //array index out of bounds exception
        int arr[]={};
        try{
            System.out.println(arr[0]);
        } catch(Exception e) {
            System.out.println("Error: Array index out of bounds");
        }

     }
}