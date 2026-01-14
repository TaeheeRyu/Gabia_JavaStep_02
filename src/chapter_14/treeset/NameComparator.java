package chapter_14.treeset;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
  
  @Override
  public int compare(Employee o1, Employee o2) {
    return o1.name().compareToIgnoreCase(o2.name());
  }
  
}
