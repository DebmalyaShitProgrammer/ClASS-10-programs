/**
 * Write a program to input two numbers. Print all the palindromic prime numbers present in
 * this range. [Palindromic prime is a prime number which is palindrome. Example- 11 ]
 * Then print all the twisted prime numbers of that range.
 * [ Example 13. Reverse is 31. 31 is also prime. ]
 *
 * Debmalya Bose
 * 25.4.2024
 */
import java.util.Scanner;
public class Program1
{
    public static int reverse(int n)
    {
        int rev = 0;
        while(n > 0)
        {
            rev = rev*10 + n%10;
            n /= 10;
        }
        return rev;
    }
    
    public static boolean isPrime(int n)
    {
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n%i == 0)
                return false;
        return true;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter range start: ");
        int a = sc.nextInt();
        
        System.out.print("Enter range end: ");
        int b = sc.nextInt();
        
        System.out.print("Palindrome Prime Numbers: ");
        
        for(int i = Math.min(a, b); i <= Math.max(a, b); i++)
        {
            if((i == reverse(i)) && isPrime(i))
                System.out.print(i + " ");
        }
        
        System.out.println();
        System.out.print("Twisted Prime Numbers: ");
        
        for(int i = Math.min(a, b); i <= Math.max(a, b); i++)
        {
            if(isPrime(i) && isPrime(reverse(i)))
                System.out.print(i + " ");
        }
    }
} 
