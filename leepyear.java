class leepyear {
    public static void main(String[] args) {
        int year = 2026; // Example year, you can change this or take input
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year +" is not a leap year.");
        }
    }
}
