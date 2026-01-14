package chapter_14.treeset;

import java.util.*;

public class ComparableStudentMain_03 {
  public static void main(String[] args) {
    List<Student_03> students = new ArrayList<Student_03>();

    students.add(new Student_03("홍길동", 90));
    students.add(new Student_03("고길동", 80));
    students.add(new Student_03("이길동", 85));

    System.out.println("정렬 전");
    for (Student_03 s : students) System.out.println(s);
    System.out.println();

    Collections.sort(students);

    System.out.println("정렬 후");
    for (Student_03 s : students) System.out.println(s);
  }
}
