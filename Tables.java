import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        for(int i=0;i<=x;i++)
        {
            if(i%2==1)
            {
                System.out.format("%d x %d = %d
",n,i,n*i);
            }
        }
    }
}