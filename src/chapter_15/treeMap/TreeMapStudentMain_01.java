package chapter_15.treeMap;

import java.util.TreeMap;

public class TreeMapStudentMain_01 {
  public static void main(String[] args) {
    TreeMap<String, Integer> studentScore = new TreeMap<String, Integer>();

    studentScore.put("David", 95);
		studentScore.put("Bob", 92);
		studentScore.put("Alice", 85);
		studentScore.put("Charlie", 78);

    System.out.println("=== 학생 성적 출력(이름순 정렬) ===");
    for (String name : studentScore.keySet()) System.out.println(name + ": " + studentScore.get(name));

    // 특정 학생 조회
    String studentName = "Bob";

    System.out.println("\n=== " + studentName + " 학생의 성적 조회 ===");
    System.out.println(studentName + ": " + studentScore.get(studentName));
  }
}
