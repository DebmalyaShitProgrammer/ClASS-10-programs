
/**
 * Write a program with the following methods.
 * a) void pattern( int h) => it will print
 * 1 1
 * 12 33
 * 123 666
 * b) void pattern( int h, char m) => It will print upside down right angled triangle by using the character present in m.
 * c) void pattern(int a, int b,char c) => will print a hollow rectangle of the length a and width b by using the character present in c.
 * d) void main()=> It will call the above methods by using proper values.
 *
 * Debmalya Bose
 * 28.4.2024
 */
public class Program5
{
    void pattern(int h)
    {
        for(int i = 1; i <= h; i++)
        {
            for(int j = 1; j <= i; j++)
                System.out.print(j);
            System.out.print(" ");
            for(int j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println();
        }
    }
    
    void pattern(int h, char m)
    {
        for(int i = h; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
                System.out.print(m);
            System.out.println();
        }
    }
    
    void pattern(int a, int b, char c)
    {
        for(int i = 1; i <= a; i++)
        {
            if(i == 1 || i == a)
                for(int j = 1; j <= b; j++)
                    System.out.print(c);
            else
            {
                System.out.print(c);
                for(int j = 1; j <= (b-2); j++)
                    System.out.print(" ");
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
