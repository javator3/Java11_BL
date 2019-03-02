package pl.java.Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

     var zmienna = "Wartosc";
     var list = new ArrayList<String>();
     list.add("test");

        System.out.println(zmienna);
        System.out.println(list);

        var l = List.of("A", "B", "C");
        var copy = List.copyOf(l);

        var map = Map.of("A", 1, "B", 2);
        System.out.println(map);

    }
}
