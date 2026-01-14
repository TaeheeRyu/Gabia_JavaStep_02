package chapter_15.hashMap;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapDifference_03 {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<String, String>();

    map.put("apple", "red");
    map.put("banana", "yellow");
    map.put("grape", "purple");
    map.put("lemon", "yellow");

    for(Map.Entry<String, String> entry : map.entrySet()) {
      String value = entry.getValue();
      System.out.println(entry.getKey() + " : " + value);
    }
// ======================================================================
    Map<String, String> linkedhashMap = new LinkedHashMap<String, String>();

    linkedhashMap.put("apple", "red");
    linkedhashMap.put("banana", "yellow");
    linkedhashMap.put("grape", "purple");
    linkedhashMap.put("lemon", "yellow");

    for(Map.Entry<String, String> entry : linkedhashMap.entrySet()) {
      String value = entry.getValue();
      System.out.println(entry.getKey() + " : " + value);
    }
  }
}
