import java.util.Scanner;
class circle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float r,area;
        r=sc.nextInt();
        area=(float)(r*r*3.14);
        System.out.format("%.2f",area);

    }
}