//Implementattion of HashMap IN JAVA
import java.util.*;
public class Student{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Glorry", 20);
        map.put("Steven", 26);
        map.put("Shariff", 22);

        System.out.println(map.get("Glorry"));

    }
}