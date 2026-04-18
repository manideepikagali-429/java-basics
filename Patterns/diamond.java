public class diamond {
    public static void main(String[] args)
    {
        int n=4;
        for(int i=1;i<=2*n-1;i++)
        {
            int row =(i<=n)?i:2*n-i;
            for(int s=1;s<=n-row;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*row-1;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
