package project2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainClass2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(4, "String 1");
        hashMap.put(5, "String 2");
        hashMap.put(8, "String 3");
        hashMap.put(1, "String 4");
        hashMap.put(9, "String 5");
        hashMap.put(6, "String 6");
        hashMap.put(1, "String 7");
        hashMap.put(3, "String 8");
        hashMap.put(3, "String 9");
        hashMap.put(1, "String 10");

        System.out.println(hashMap);

        Set<Map.Entry<Integer, String>> entrySet1 = hashMap.entrySet();
        System.out.println("Key value > 5: " );
        entrySet1.stream().filter(n -> n.getKey() > 5).forEach(n -> System.out.println(n.getKey() + " " + n.getValue()));

        System.out.println("--------------------------");

        Set<Map.Entry<Integer, String>> entrySet2 = hashMap.entrySet();
        System.out.println("If key value = 0 output lines separated by commas: ");
        entrySet2.stream().filter(n -> n.getKey() == 0).forEach(n -> System.out.println(n.getValue() + ", "));

        System.out.println("--------------------------");

        Set<Map.Entry<Integer, String>> entrySet3 = hashMap.entrySet();

        System.out.println("Multiply all keys greater than > 5: ");
        System.out.println(entrySet3.stream().filter(n -> n.getValue().length() > 5).mapToInt(Map.Entry::getKey).reduce(1, (x,y) -> x * y));

        //Перемножить
        //все ключи, где длина строки>5.
    }
}
