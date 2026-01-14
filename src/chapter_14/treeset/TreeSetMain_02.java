package chapter_14.treeset;

import java.util.*;

public class TreeSetMain_02 {
  public static void main(String[] args) {
    Set<String> set = new TreeSet<String>(new Mycompare());

    set.add("aaa");
    set.add("CCC");
    set.add("bbb");
    set.add("DDD");

    System.out.println(set);
  }
}

class Mycompare implements Comparator<String> {

  @Override
  public int compare(String o1, String o2) {
    return o1.compareToIgnoreCase(o2) * -1;
  }
  
}