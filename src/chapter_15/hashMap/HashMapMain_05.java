package chapter_15.hashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapMain_05 {
  public static void main(String[] args) {
    Map<String, Integer> map = Collections.synchronizedMap(new HashMap<String, Integer>());

    map.put("apple", 0);
    map.put("banana", 20);
    map.put("grape", 30);

    System.out.println("======= 상품 재고 출력 =======");
    for (Map.Entry<String, Integer> entry : map.entrySet()) System.out.println(entry.getKey() + " : " + entry.getValue());
    System.out.println("============================");
  }
}
