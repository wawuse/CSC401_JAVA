import java.util.Scanner;

public class Question1{
public static void main(String[]args){
    double length,width,height;
    
Scanner input = new Scanner (System.in);
System.out.println("ENTER THE LENGTH:");
length = input.nextDouble();

System.out.println("ENTER THE WIDTH:");
width = input.nextDouble();

System.out.println("ENTER THE HEIGHT:");
height = input.nextDouble();

double volume = length * width * height;
double surface_area = 2* length * width + 2*length * height + 2 * width * height;

System.out.println("THE VOLUME OF THE BOX ="+ volume);
System.out.println("THE SURFACE AREA OF THE BOX ="+ surface_area);
}

}