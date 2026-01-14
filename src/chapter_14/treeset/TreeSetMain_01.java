package chapter_14.treeset;

import java.util.*;

public class TreeSetMain_01 {
  public static void main(String[] args) {
    Set<String> treeSet = new TreeSet<String>();

    treeSet.add("Orange");
    treeSet.add("Apple");
    treeSet.add("Banana");

    treeSet.add("Apple");

    System.out.println(treeSet);

    if (treeSet.contains("Banana")) {
      System.out.println("Banana 있음");
    }

    treeSet.remove("Orange");
    System.out.println(treeSet);
  }
}
