public class num{
    public static void main(String[] args)
    {
        int n=4;
        //char a='A';
        for(char i=1;i<=n;i++)
        {
            char a='A';
            for(char j=1;j<=i;j++)
            {
                System.out.print(a+" ");
            
                a++;
            }
            System.out.println(" ");
        }
    }
}