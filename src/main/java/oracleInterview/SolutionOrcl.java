package oracleInterview;

import java.util.*;

public class SolutionOrcl {


    public static void main(String[] args) {

        Map<String, List<String>> relationalMap = new HashMap<>();

        relationalMap.put("Bob", Arrays.asList("Sandra", "Alice", "Eric"));
        relationalMap.put("Sandra", Arrays.asList("Bob", "Don"));
        relationalMap.put("Alice", Arrays.asList("Bob", "John"));

        relation(relationalMap, "Bob");
    }

    public static void relation(Map<String, List<String>> relationMap, String str) {

        String[] visited = new String[relationMap.size()];
        Stack<String> stack = new Stack<>();
        stack.push(str);

        for (String string : relationMap.get(str)){
            stack.push(string);
        }
    }


}
