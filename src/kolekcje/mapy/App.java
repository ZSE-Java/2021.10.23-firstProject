package kolekcje.mapy;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();

        mapa.put("ip.db", "123.123.123.123");
        mapa.put("ip.app1", "134.134.134.134");

        System.out.println(mapa.get("ip.db"));

        int[] tab = new int[10];

        System.out.println(tab[15]);

    }
}
