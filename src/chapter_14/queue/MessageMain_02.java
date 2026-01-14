package chapter_14.queue;

import java.util.Queue;
import java.util.LinkedList;

public class MessageMain_02 {
  public static void main(String[] args) {
    Queue<Message> queue = new LinkedList<Message>();

    Message msg1 = new Message("sendMessage", "강상구");
    Message msg2 = new Message("sendMessage", "강상구");
    Message msg3 = new Message("sendMessage", "강상구");

    queue.offer(msg1);
    queue.offer(msg2);
    queue.offer(msg3);

    while (!queue.isEmpty()) {
      Message msg = queue.poll();

      switch(msg.command) {
        case "sendMessage" -> System.out.println(msg.to + "님에게 메시지를 보냅니다.");
        case "receiveMessage" -> System.out.println(msg.to + "님으로부터 메시지를 받습니다.");
        case "deleteMessage" -> System.out.println(msg.to + "님의 메시지를 삭제합니다.");
        case "saveMessage" -> System.out.println(msg.to + "님의 메시지를 저장합니다.");
        case "viewMessage" -> System.out.println(msg.to + "님의 메시지를 조회합니다.");
        default -> System.out.println("알 수 없는 명령입니다.");
      }
    }
  }
}
