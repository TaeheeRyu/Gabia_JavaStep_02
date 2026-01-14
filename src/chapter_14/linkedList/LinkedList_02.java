package chapter_14.linkedList;

public class LinkedList_02 {
  public static void main(String[] args) {
    java.util.LinkedList<String> list = new java.util.LinkedList<String>();
    
    list.add("A");
    list.add("B");
    list.add("C");

    System.out.println(list);
    list.add(1, "D");
    System.out.println(list);

    list.addFirst("S");
    System.out.println(list);

    System.out.println(list.removeLast());
    System.out.println(list);
  }
}
