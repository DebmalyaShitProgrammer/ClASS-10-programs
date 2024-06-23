/**
 * Calculate total charge for a letter. Input letter type( I/F => Inland or Foreign As per the following
 * rules.
 * TYPE     weight          charge
 * I        <50 g           Rs 20
 * I        >=50 to <70     Rs 3/gm for the weight of this range
 * I        otherwise       Rs 5/gm for the weight of this range
 * F        <50 gm          Rs 50
 * F        >=50 to <70     Rs 5/gm for this range
 * F        otherwise       Rs 7/gm for this range
 *
 * Debmalya Bose
 * 24.4.2024
 */
import java.util.*;
public class Program2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter weight: ");
        int weight = sc.nextInt();
        
        System.out.print("Enter Type (I/F): ");
        char type = sc.next().charAt(0);
        
        int charge = 0;
        
        switch(type)
        {
            case 'I':
                if(weight < 50)
                    charge = 20;
                else if(weight < 70)
                    charge = 20 + (weight-49)*3;
                else
                    charge = 20 + 19*3 + (weight-69)*5;
                System.out.print("Charge: " + charge);
                break;
                
            case 'F':
                if(weight < 50)
                    charge = 50;
                else if(weight < 70)
                    charge = 20 + (weight-49)*5;
                else
                    charge = 20 + 19*5 + (weight-69)*7;
                System.out.print("Charge: " + charge);
                break;
            
            default:
                System.out.println("Invalid Type");
        }
    }
}
