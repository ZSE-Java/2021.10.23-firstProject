package kolekcje.sety;

import java.util.Iterator;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("Janusz");
        set.add("Adam");
        set.add("Karol");
        set.add("Zbyszek");
        set.add("Zbyszek");

        System.out.println(set);

        System.out.println(set.size());

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println(set.hashCode());
    }


}
