class stringobjects {
    public static void main(String[] args) {
        String s = "abc";
        String a = new String("abc");
        System.out.println(s==a);
        System.out.println(s.equals(a));
    }
}
