package learning.java.java8;

import java.util.*;
import java.util.function.Consumer;

public class ForEachExample {

    public static void iterateMap(Map<String, String> countryMap) {

        System.out.println("<----------Iterating in normal way------------->");
        for(Map.Entry<String, String> entry:countryMap.entrySet()) {
            System.out.println("Country: "+entry.getKey()+" : Capital: "+entry.getValue());
        }
    }

    public static void iterateMapUsingForEach(Map<String, String> countryMap) {

        System.out.println("\n<----------Iterating using forEach method------------>");
        countryMap.forEach((k,v)->System.out.println("Country: "+k+" : Capital: "+v));
        countryMap.forEach((k,v)->{
        });

    }

    public static void iterateList(List<String> countryList) {
        System.out.println("<-----Iterating in normal way----->");
        for(String country : countryList) {
            System.out.println(country);
        }
    }

    public static void iterateListUsingForEach(List<String> countryList) {
        System.out.println("\n<---Iterating using forEach method--->");
        countryList.forEach(country->{
            System.out.println(country);
        });
    }

}
