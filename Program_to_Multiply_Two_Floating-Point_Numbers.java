import java.util.Scanner;
class product
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b;
        float product;
        a=sc.nextFloat();
        b=sc.nextFloat();
        product=a*b;
        System.out.format("%.2f",product);
    }
}