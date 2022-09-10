import java.util.Scanner;
class Vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c;
        c=sc.nextLine().charAt(0);
        char ch;
        ch=Character.toLowerCase(c);
        if(ch=='a' | ch=='e' | ch=='i' | ch=='o' | ch =='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}