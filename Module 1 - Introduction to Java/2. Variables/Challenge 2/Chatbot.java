import java.util.Locale;
import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        String name = sc.nextLine();

        System.out.printf("\nHi %s ! I'm Javabot. Where are you from?\n", name);
        String city = sc.nextLine();

        System.out.printf("\nI hear it's beautiful at %s! I'm from a place called Oracle\n", city);
        System.out.println("How old are you? ");
        int age = sc.nextInt();
        int calc = 400 / age;

        System.out.printf("\nSo you're %d, cool! I'm 400 years old.\n", age);
        System.out.printf("This means I'm %d times older than you.\n", calc);
        System.out.println("Enough about me. What's your favourite language? (just don't say Python) ");
        sc.nextLine();
        String language = sc.nextLine();

        System.out.printf("\n%s, that's great! Nice chatting with you %s. I have to log off now. See ya!", language,name);

        sc.close();

    }
}
