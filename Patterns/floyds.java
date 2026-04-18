public class floyds {
    public static void main(String[] args)
    {
 int n=4;
 int num =10;
 for(int i=num;i>=n;i--){
    for(int j=1;j<=i;j++)
    {
        System.out.print(num+" ");
        num--;
    }
    System.out.println();
}
    }
}
