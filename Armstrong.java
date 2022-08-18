import java.util.*;

class Armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int nc=n,a=0;
        while(n!=0)
        {
            a=a+(n%10)*(n%10)*(n%10);
            n=n/10;
        }
        if(a==nc)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
        
    }
}