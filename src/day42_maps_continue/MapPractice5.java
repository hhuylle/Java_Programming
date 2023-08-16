package day42_maps_continue;

import java.util.Map;
import java.util.TreeMap;

public class MapPractice5 {

    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Henry");
        map.put("D02", "Kelly");
        map.put("A03", "Jenny");

        map.forEach( (k, v) -> {
            System.out.println(k+" : "+v);} );

        // output:
        // A02 : Henry
        // A03 : Jenny
        // B03 : Nora
        // C02 : Josh
        // D02 : Kelly
    }
}
