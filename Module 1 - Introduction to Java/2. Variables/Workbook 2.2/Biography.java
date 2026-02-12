public class Biography {
    public static void main(String[] args) {
       
        char grade = 'A';

        int age, hours;
        age = 42;
        hours = 2;

        String name, country, sport, game, subject;
        name = "Gus";
        country = "Brasil";
        sport = "tennis";
        game = "Street Fighter";
        subject = "Computer Science";
     
        System.out.printf("My name is %s. I'm %d years old, and I'm from %s.\n", name, age, country);
        System.out.printf("My favourite sport is %s. I play for %d hours a day.\n", sport, hours);
        System.out.printf("When I'm tired, I like to play %s.\n", game);
        System.out.printf("In school, my favourite subject was %s, I scored an %s.\n", subject, grade);

    }
}
