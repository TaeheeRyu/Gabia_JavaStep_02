package chapter_15.hashMap;

import java.util.*;

public class HashMapMain_01 {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();

    map.put("강상구", 20);
    map.put("서효근", -100);
    map.put("김철수", 30);

    System.out.println("총 Entry 수: " + map.size()); 

    // 객체 찾기
    System.out.println("강상구: " + map.get("강상구"));
    System.out.println();

    // 객체 키 모두 받기
    Set<String> keySet = map.keySet();
    Iterator<String> keyIterator = keySet.iterator();

    while (keyIterator.hasNext()) {
      String key = keyIterator.next();
      Integer value = map.get(key);
      
      System.out.println("\t" + key + ": " + value);
    }
  }
}
