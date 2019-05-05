import java.util.Scanner;

public class Equation{
public static void main(String []args){
    int a,b,c;
    double root1,root2;
Scanner input = new Scanner(System.in);
System.out.println("ENTER VALUE FOR a:");
a = input.nextInt();

System.out.println("ENTER VALUE FOR b:");
b = input.nextInt();

System.out.println("ENTER VALUE FOR c:");
c = input.nextInt();

root1 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
root2 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
System.out.println("THE FIRST ROOT OF THE EQUATION ="+ root1);
System.out.println("THE SECOND ROOT OF THE EQUATION ="+ root2);

}
}