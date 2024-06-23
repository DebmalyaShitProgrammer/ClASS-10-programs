/**
 * Write a description of class Program6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Program6
{
    int factorial(int n)
    {
        int f = 1;
        for(int i = 1; i <= n; i++) 
            f *= i;
        return f;
    }
    
    boolean isPrime(int n)
    {
        for(int i = 2; i <= (int) Math.sqrt(n); i++)
            if(n % i == 0)
                return false;
        return true;
    }
    
    int fiboTerm(int n)
    {
        int a = 1, b = 1, c = 0;
        for(int i = 1; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
    
    void series1(int x, int n)
    {
        double s = 0;
        int c = 1;
        
        for(int i = 1; i <= n; i++)
        {
            s += Math.pow(x, i)/factorial(fiboTerm(i)) * c;
            c *= -1;
        }
        System.out.println(s);
    }
    
    void series(int a, int b)
    {
        int s = 0;
        for(int i = Math.min(a,b); i <= Math.max(a,b);i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
                s += i;
            }
        }
        System.out.println(s);
    }
    
    void main()
    {
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("0. Exit");
            System.out.println("1. Series1");
            System.out.println("2. Series 2");
            System.out.println("Enter your Choice: ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 0: System.exit(0);
                case 1:
                    System.out.print("Enter the value of X and the number of terms: ");
                    series1(sc.nextInt(), sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter Range: ");
                    series(sc.nextInt(), sc.nextInt());
                    break;
                default: System.out.print("Invalid Input");
            }
        }
    }
}