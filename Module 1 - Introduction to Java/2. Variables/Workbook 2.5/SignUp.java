import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        System.out.println("What is your first name?");
        String firstName = sc.next();

        System.out.println("What is your last name?");
        String lastName = sc.next();

        System.out.println("How old are you?");
        int age = sc.nextInt();

        System.out.println("Make a username");
        String username = sc.next();

        System.out.println("What city do you live in?");
        sc.nextLine();
        String city = sc.nextLine();

        System.out.println("What country is that?");
        String country = sc.nextLine();

        System.out.println("Thank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered:");
        System.out.printf("\tFirst Name: %s\n", firstName);
        System.out.printf("\tLast Name: %s\n", lastName);
        System.out.printf("\tAge: %d\n", age);
        System.out.printf("\tUsername: %s\n", username);
        System.out.printf("\tCity: %s\n", city);
        System.out.printf("\tCountry: %s\n", country);

        sc.close();
    }
}
