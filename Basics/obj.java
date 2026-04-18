class Calculator{
    public int add(int n1,int n2)
    {
    int r = n1+n2;
    //System.out.println(r);
    return r;
    }
}
public class obj {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 9;
        Calculator calc = new Calculator();
        int result = calc.add(num1,num2);
        //int result = num1+num2;
       System.out.println(result);
    }
}
