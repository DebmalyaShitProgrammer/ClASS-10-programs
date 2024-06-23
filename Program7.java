
/**
 * 7. Write a menu driven program to call methods from main to print patterns.
 * a) void pattern1( int h) => it will print the following patter by using the height.
 * a     a
 * ab   ba
 * abc cba
 * abcdcba
 * b) void pattern2 ( int h) => to print the following patter.
 * 1 2. 3 4. ###
 * 1 2. 3 %%
 * 1 2. #
 * 1
 * c) void main ( )=> Will print a menu [ 1. Pattrn1 2. Pattern2 ]. It will input the option and height. 
 * According to the height it will call the method to print the pattern.
 *
 * Debmalya Bose
 * 25.5.2024
 */
import java.util.Scanner;
public class Program7
{
    void pattern1(int h)
    {
        for(int i = 1; i <= h; i++)
        {
            for(int j = 1; j <= i; j++)
                System.out.print((char)(96+j));
                
            for(int sp = 1; sp <= 2*(h-i)-1; sp++)
                System.out.print(" ");

            for(int j = i; j >= 1; j--)
                if(j != h)
                    System.out.print((char)(96+j));
            System.out.println();
        }
    }

    void pattern2(int h)
    {
        for(int i = h; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
                System.out.print(j%2 == 0 ? j+". ":j+" ");
            System.out.print(" ");
            for(int j = 1; j <= i - 1; j++)
                System.out.print(i%2 != 0 ? "%":"#");
            System.out.println();
        }
    }
    
    void main()
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.print("0. Exit");
            System.out.print("1. First Pattern");
            System.out.print("2. Second Pattern");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 0: System.exit(0);
                case 1:
                    System.out.print("Enter Height: ");
                    pattern1(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter Height: ");
                    pattern2(sc.nextInt());
                    break;
                default:
                    System.out.print("Invalid Choice");
            }
        }
    }
}
