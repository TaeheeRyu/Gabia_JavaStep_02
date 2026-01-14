package chapter_14.vector;

import java.util.*;

public class BoardMain_02 {
  public static void main(String[] args) {
    // List<Board_02> list = new Vector<Board_02>();
    List<Board_02> syncList = Collections.synchronizedList(new Vector<Board_02>());

    // Board 객체 생성 == 내용
    Board_02 board1 = new Board_02("제목1", "내용1", "글쓴이1");

    syncList.add(board1);
    syncList.add(new Board_02("제목2", "내용2", "글쓴이2"));
    syncList.add(new Board_02("제목3", "내용3", "글쓴이3"));
    syncList.add(new Board_02("제목4", "내용4", "글쓴이4"));
    syncList.add(new Board_02("제목5", "내용5", "글쓴이5"));

    for (int i = 0; i < syncList.size(); i++) {
      Board_02 board = syncList.get(i);
      System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
    } System.out.println();

    // 내용 삭제 2번
    syncList.remove(2);
    System.out.println("=== 2번 인덱스 삭제 후 ===");
    for (int i = 0; i < syncList.size(); i++) {
      Board_02 board = syncList.get(i);
      System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
    }

    syncList.remove(2);
    System.out.println("=== 2번 인덱스 삭제 후 ===");
    for (int i = 0; i < syncList.size(); i++) {
      Board_02 board = syncList.get(i);
      System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
    }
  }
}
