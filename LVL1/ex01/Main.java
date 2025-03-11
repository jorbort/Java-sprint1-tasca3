import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    public static void main(String[] argv) {
        Month january = new Month("January");
        ArrayList<Month> year = new ArrayList<>();
        year.add(january);
        year.add(new Month("February"));
        year.add(new Month("March"));
        year.add(new Month("April"));
        year.add(new Month("May"));
        year.add(new Month("June"));
        year.add(new Month("July"));
        year.add(new Month("September"));
        year.add(new Month("October"));
        year.add(new Month("November"));
        year.add(new Month("December"));

        System.out.println("year array before adding august: ");
        for (Month month : year) {
            System.out.println(month.getName());
        }
        System.out.println("--------------");
        year.add(7, new Month("August"));
        System.out.println("after adding august and iterating with a for loop");
        for (Month month : year) {
            System.out.println(month.getName());
        }
        System.out.println("--------------");
        System.out.println("With iterator");
        Iterator<Month> iter = year.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().getName());
        }
        HashSet<Month> hashYear = new HashSet<>(year);
        System.out.println("--------------");
        System.out.println("HashSet With for loop");
        for (Month month : hashYear) {
            System.out.println(month.getName());
        }
        Iterator<Month> hashIter = hashYear.iterator();
        System.out.println("--------------");
        System.out.println("HashSet With iterator");
        while (hashIter.hasNext()) {
            System.out.println(hashIter.next().getName());
        }
        System.out.println("--------------");
        System.out.println("trying to add january again");
        System.out.println("Was january added again? " + hashYear.add(january));
    }
}
