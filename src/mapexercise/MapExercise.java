/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapexercise;
import java.util.*;
import java.util.stream.Collectors;


/**
 *
 * @author root
 */
public class MapExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Map<String, List<String>> map = new HashMap<>();

    put(map, "Congo DRC", "Thisekedi");
    put(map, "Congo DRC", "kinshasa");
    put(map, "Rwanda",    "Kagame");
    put(map, "Rwanda",    "Kigali");
    put(map, "Tanzanie",  "Magufuli" );
    put(map, "Tanzanie",  "Dar-es-salam" );
    put(map, "Ouganda",   "Museveni");
    put(map, "Ouganda",   "kampala");
      

    map.forEach((s, strings) -> {
        System.out.print(s + ": " + " - " );
        System.out.println(strings.stream().collect(Collectors.joining(", " + "\n" +  "         " +  " - ")) + "\n");
    });
}

private static <KEY, VALUE> void put(Map<KEY, List<VALUE>> map, KEY key, VALUE value) {
    map.compute(key, (s, strings) -> strings == null ? new ArrayList<>() : strings).add(value);

      }
}
