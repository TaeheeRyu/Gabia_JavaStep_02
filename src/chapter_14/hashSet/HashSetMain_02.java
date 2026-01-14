package chapter_14.hashSet;

import java.util.*;

public class HashSetMain_02 {
  public static void main(String[] args) {
    Set<String> hashSet = new HashSet<String>();

    hashSet.add("Apple");
    hashSet.add("Banana");
    hashSet.add("Orange");

    hashSet.add("Apple"); // 중복 허용 안됨

    System.out.println(hashSet);

    if (hashSet.contains("Banana")) System.out.println("Banana 있음");

    hashSet.remove("Orange");
    System.out.println(hashSet);
  }
}
