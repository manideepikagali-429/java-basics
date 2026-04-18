import java.util.*;
public class missing {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = (n*(n+1))/2;
        int s = 0;
        for(int i=0;i<n-1;i++)
        {
           s += sc.nextInt();
        }
       int i =  sum-s;
        System.out.println("missing number is "+i);
    }
}
