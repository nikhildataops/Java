import java.util.*;

public class HashMapBasics {
    static void main(String[] args) {
//        Map<String,String> mapping=new HashMap<>();
//        Map<String,String> mapping=new LinkedHashMap<>();
        Map<String,String> mapping=new TreeMap<>();
        //insertion
        mapping.put("in","India");
        mapping.put("in","india");
        mapping.put("en","England");
        mapping.put("us","United States");
        System.out.println(mapping);


        Map<String,String> table=new HashMap<>();
        table.put("br","Brazil");
        System.out.println("Before: " + table);
        table.putAll(mapping);
        System.out.println(table);
        //deletion
        table.remove("en");
        System.out.println(table);
        table.putIfAbsent("in","india3");
        System.out.println(table);
        table.putIfAbsent("is","india3");
//        System.out.println(table.size());
//        table.clear();
        System.out.println(table);
        System.out.println(table.get("br"));
        System.out.println(table.getOrDefault("us","none"));
        System.out.println(table.getOrDefault("usa","none"));
        System.out.println(table.containsKey("in"));
        System.out.println(table.containsKey("im"));
        System.out.println(table.containsValue("United States Of America"));
        System.out.println(table);
        table.replace("is","island");
        System.out.println(table);

        Set<String> keyset=table.keySet();
        System.out.println(keyset);
//        System.out.println(table.keySet());
        Collection<String> valueSet=table.values();
        System.out.println(valueSet);
//        System.out.println(table.values());
        System.out.println();
        // get all the entries from the map
        Set<Map.Entry<String,String>> entryset= table.entrySet();
        System.out.println(entryset);








    }
}
