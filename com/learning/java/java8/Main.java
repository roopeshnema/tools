package learning.java.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // 1. ForEach Examples : Map and List.

        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "Delhi");
        countryMap.put("USA", "Washington, D.C.");
        countryMap.put("Japan", "Tokyo");
        countryMap.put("Canada", "Ottawa");

        // iterate through Map normal way
        ForEachExample.iterateMap(countryMap);

         // iterate through Map using forEach method
        ForEachExample.iterateMapUsingForEach(countryMap);


        List<String> countryList = new ArrayList<>();
        countryList.add("India");
        countryList.add("USA");
        countryList.add("Japan");
        countryList.add("Canada");

        // iterate through List normal way
        ForEachExample.iterateList(countryList);

        // iterate through List using forEach method
        ForEachExample.iterateListUsingForEach(countryList);


        // 2. Default method example.
        new DefaultMethodsExample().someMethod();



    }

}
