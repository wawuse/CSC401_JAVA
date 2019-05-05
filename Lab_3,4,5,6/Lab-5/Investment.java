import java.util.Scanner;
public class Investment
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int p,t,r;
        int counter = 1;
        
        while (counter <= 5 )
        {
            System.out.println("Please enter the initial investment: ");
            p = input.nextInt();
            
            System.out.println("Please enter the number of years: ");
            t = input.nextInt();
            
            System.out.println("Please enter the interest rate: ");
            r = input.nextInt();
            
            
            //double investment = p * Math.pow((1 + r/100),t);
            double investment = p * ((1 + r/100) ^ t);
            System.out.println("The Investment is: " + investment);
            counter++;
        }
    }
}
