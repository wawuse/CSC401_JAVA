import java.util.Scanner;
public class Question3{
    
public static void main(String []args){
Scanner input = new Scanner (System.in);
int longestside,shortestside;

System.out.println("ENTER THE FIRST SIDE OF THE TRIANGLE:");
int a = input.nextInt();

System.out.println("ENTER THE SECOND SIDE OF THE TRIANGLE:");
int b = input.nextInt();

System.out.println("ENTER THE THIRD SIDE OF THE TRIANGLE:");
int c = input.nextInt();

if (a > b && a > c)
        {
            longestside = a;
            System.out.println("THE LONGEST SIDE OF THE TRIANGLE IS =" + longestside );
            if (a < b && a < c){
            shortestside = a;
           System.out.println("THE SHORTEST SIDE OF THE TRIANGLE IS =" + shortestside );
           double remender = longestside % shortestside;
           System.out.println("THE REMENDER OF THE TRIANGLE IS =" + remender );
        }
           
        }else if(b > a && b > c){
 longestside = b;
 System.out.println("THE LONGEST SIDE OF THE TRIANGLE IS =" + longestside );
            if (b < a && b < c){
            shortestside = b;
           System.out.println("THE SHORTEST SIDE OF THE TRIANGLE IS =" + shortestside );
           double remender = longestside % shortestside;
           System.out.println("THE REMENDER OF THE TRIANGLE IS =" + remender );
        }
}else if(c > a && c > b){
 longestside = c;
 System.out.println("THE LONGEST SIDE OF THE TRIANGLE IS =" + longestside );
            if (c < a && c < b){
            shortestside = c;
           System.out.println("THE SHORTEST SIDE OF THE TRIANGLE IS =" + shortestside );
           double remender = longestside % shortestside;
           System.out.println("THE REMENDER OF THE TRIANGLE IS =" + remender );
        }
}
 //using Heron's Formula
double s = (a + b + c)/2;
double area = Math.sqrt(s *((s-a) * (s-b) * (s-c)));
double perimeter = (a + b + c)/2;


System.out.println("THE PERIMETER OF THE TRIANGLE IS ="+ perimeter);
System.out.println("THE AREA OF THE TRIANGLE IS =" + area );


}

}