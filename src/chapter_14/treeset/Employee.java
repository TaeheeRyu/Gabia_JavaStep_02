package chapter_14.treeset;

public record Employee(String name, int age) {
  @Override
  public String toString() {
    return name + ": " + age + "살";
  }
}
