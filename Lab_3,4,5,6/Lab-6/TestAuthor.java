import java.util.Scanner;

public class TestAuthor
{
    public static void main(String[] args)
    {
        int Counter = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Please enter your email: ");
        String email = input.nextLine();
        System.out.println("Please enter your gender: ");
        char gender = input.next().charAt(0);
        

        Author author = new Author(name, email, gender);
        
        
        System.out.println("The Authors name is: " + author.getName());
        System.out.println("The Authors email is: " + author.getEmail());
        System.out.println("The Authors details is: " + author);
        System.out.println("Enter a new Email Address: ");
        author.setEmail(input.nextLine());
        System.out.println("The Author's details is: " + author.toString());
        
    }
}
