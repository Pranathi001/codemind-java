import java.util.Scanner;
class average 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        float sum,average ;
        a=sc.nextInt();
        b=sc.nextInt();
        sum=(a+b);
        average =sum/2;
        System.out.format("%.4f",average);
    }
}