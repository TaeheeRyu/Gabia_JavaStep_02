package chapter_14.queue;

public class QueueMain_01 {
  public static void main(String[] args) {
    MyQueue_01 queue = new MyQueue_01();

    queue.enQueue("A");
    queue.enQueue("B");
    queue.enQueue("C");

    System.out.println(queue);

    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    
    System.out.println(queue);
  }
}
