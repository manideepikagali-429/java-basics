public class two {
    public static void main(String[] args) {
        int a = 59;
        int b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swapping logic using arithmetic
        a = a + b; // a = 30
        b = a - b; // b = 10
        a = a - b; // a = 20

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}

