package chapter_15.hashMap;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class HashMapMain_02 {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<String, String>();

    // id: Key  |  pw: Value
    map.put("admin", "1234");
    map.put("user1", "abcd");
    map.put("user2", "xyz");
    map.put("user3", "qwer");

    System.out.println("총 Entry 수: " + map.size());

    Scanner scan = new Scanner(System.in);

    while (true) {
      System.out.println("아이디와 비밀번호를 입력하세요!");
			System.out.print("아이디 : ");
      String id = scan.next();

      if (map.containsKey(id)) {
        System.out.print("비밀번호 : ");
        String pw = scan.next();

        if (map.get(id).equals(pw)) { System.out.println("로그인 성공!"); break; }
        else System.out.println("비밀번호가 틀렸습니다.");

      } else System.out.println("존재하지 않는 아이디입니다.");
    }
  }
}
