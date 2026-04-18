import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int a, b, c;
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter value1: ");
        a = Sc.nextInt();

        System.out.print("Enter value2: ");
        b = Sc.nextInt();

        c = a + b;
        System.out.println("Sum is: " + c);
    }
}
