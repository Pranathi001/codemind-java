import java.util.Scanner;
class code
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.nextLine().charAt(0);
        char ch1;
        ch1=Character.toLowerCase(ch);
        if(ch1=='v')
        {
            System.out.println("Violet");
        }
        else if(ch1=='i')
        {
            System.out.println("Indigo");
        }
        else if(ch1=='b')
        {
            System.out.println("Blue");
        }
        else if(ch1=='g')
        {
            System.out.println("Green");
        }
        else if(ch1=='y')
        {
            System.out.println("Yellow");
        }
        else if(ch1=='o')
        {
            System.out.println("Orange");
        }
        else if(ch1=='r')
        {
            System.out.println("Red");
        }
        else
        {
            System.out.println("-1");
        }
    }
}