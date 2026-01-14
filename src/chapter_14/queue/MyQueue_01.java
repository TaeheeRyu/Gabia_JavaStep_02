package chapter_14.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue_01 {
  Queue<String> queue;

  MyQueue_01() { queue = new LinkedList<String>(); }

  void enQueue(String data) { queue.add(data); }

  String deQueue() { 
    int len = queue.size();

    if (len == 0) {
      System.out.println("큐가 비어있습니다.");
      return null;
    } return queue.poll(); 
  }

  @Override
  public String toString() { return queue.toString();  }
}