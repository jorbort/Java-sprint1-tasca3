package LVL1.ex02;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Main {

    public static void main(String[] argv) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println("First list: " + list1);
        List<Integer> list2 = new ArrayList<>();
        ListIterator<Integer> list1iter = list1.listIterator(list1.size());
        while (list1iter.hasPrevious()) {
            list2.add(list1iter.previous());
        }
        System.out.println("Second list: " + list2);
    }
}
