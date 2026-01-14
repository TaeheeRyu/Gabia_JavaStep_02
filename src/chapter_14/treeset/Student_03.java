package chapter_14.treeset;

public class Student_03 implements Comparable<Student_03> {
  private String name;
  private int score;

  // 기본생성자 -> 안 쓸 예정

  // 생성자
  public Student_03(String name, int score) {
    this.name = name;
    this.score = score;
  }

  // 메서드
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public int getScore() { return score; }
  public void setScore(int score) { this.score = score; }

  @Override
  public String toString() {
    return "이름: " + name + "  |  점수: " + score;
  }

  @Override
  public int compareTo(Student_03 o) {
    return Integer.compare(this.score, o.score);
  }  
}
