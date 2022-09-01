import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Anton", "Strauss Kahn", 45));
        people.add(new Person("Ivan", "Pelem Khols", 32));
        people.add(new Person("Anna", "Metronova Slobodskaia Plam", 28));
        people.add(new Person("Irina", "Ivanova", 55));
        people.add(new Person("Pavel", "Novikov Priboi Harber Rimskei", 23));
        people.add(new Person("Roman", "Pastyhov", 48));
        people.add(new Person("Sasha", "Anri Simon", 20));
        people.add(new Person("Elena", "Alvares Dorado Avgusto Palo River", 28));
        System.out.println(people);

        Collections.sort(people, (a, b) ->
                {
                    int word1 = a.getSurname().split(" ").length;
                    int word2 = b.getSurname().split(" ").length;

                    if (word1 > 4 && word2 > 4 || word1 == word2) {
                        return Integer.compare(a.getAge(), b.getAge());
                    }
                    return Integer.compare(word1, word2);
                }
        );
        System.out.println(people);
    }
}
