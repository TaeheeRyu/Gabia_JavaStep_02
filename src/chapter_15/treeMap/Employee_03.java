package chapter_15.treeMap;

public class Employee_03 {
  String name;
  int age;

  public Employee_03(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return name + "  |  나이: " + age + "세";
  }

  
}
