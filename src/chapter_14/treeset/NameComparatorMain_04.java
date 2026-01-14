package chapter_14.treeset;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class NameComparatorMain_04 {
  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<Employee>();

    employees.add(new Employee("b", 20));
    employees.add(new Employee("c", 10));
    employees.add(new Employee("a", 30));

    System.out.println("정렬 전");
    for (Employee e : employees) System.out.println(e);
    System.out.println();

    Collections.sort(employees, new AgeComparator());

    System.out.println("정렬 후");
    for (Employee e : employees) System.out.println(e);
  }
}
