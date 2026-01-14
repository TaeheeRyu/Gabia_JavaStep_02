package chapter_14.linkedList;

import java.util.*;

public class LinkedList_01 {
  public static void main(String[] args) {
    ArrayList<String> list1 = new ArrayList<String>();
    List<String> list2 = new LinkedList<String>();

    long startTime, endTime;

    startTime = System.nanoTime();

    for (int i = 0; i < 10000; i++) list2.add(0, String.valueOf(i));

    endTime = System.nanoTime();
    System.out.println("LinkedList 걸린 시간: " + (endTime - startTime) + " ns");
  }
}
