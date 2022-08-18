import java.util.*;

class Fibbonaci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int a=1,b=1;
        if(n==1)
        {
            System.out.println("nth fibbonaci number is "+a);
        }
        else if(n==2)
        {
            System.out.println("nth fibbonaci number is "+b);
        }
        else
        {
            for(int i=3;i<=n;i++)
            {
                b=a+b;
                a=b-a;
            }
            System.out.println("nth fibbonaci number is "+b);
        }
        
    }
}