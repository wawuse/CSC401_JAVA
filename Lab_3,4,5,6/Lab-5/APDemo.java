import java.util.Scanner;
public class APDemo
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter the first term: ");
       double fTerm = input.nextDouble();
       
       System.out.println("Please enter the common difference: ");
       double cd = input.nextDouble();
       
       System.out.println("Please enter the number of term: ");
       int noOfTerm = input.nextInt();
       
       Term term = new Term(fTerm, cd, noOfTerm);
       
       System.out.println("The nth term of the series is: " + term.getTerm());
       
       System.out.println("The sum of the first n terms is: " + term.getSumOfTerm());
   }
}
