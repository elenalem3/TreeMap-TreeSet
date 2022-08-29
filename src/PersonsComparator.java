import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {
    private int maxNumbWords;

    public PersonsComparator(int maxNumbWords) {
        this.maxNumbWords = maxNumbWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int word1 = o1.getSurname().split(" ").length;
        int word2 = o2.getSurname().split(" ").length;

        if (word1 > maxNumbWords && word2 > maxNumbWords || word1 == word2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return Integer.compare(word1, word2);
    }
}
