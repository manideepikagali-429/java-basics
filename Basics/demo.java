class Calculator
{
    int a;
    public int add(int n1,int n2)
    {
int r = n1+n2;
return r;
    }
}
    public class demo {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        Calculator Calc = new Calculator();
        int sum= Calc.add(num1,num2); 
        System.out.println("Sum of two numbers: " + sum);
    }
}
