package chapter_15.treeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapComparator_02 {
  public static void main(String[] args) {
    TreeMap<Integer, Integer> scoreMap = new TreeMap<Integer, Integer>(Comparator.reverseOrder());

    scoreMap.put(1003, 85);
    scoreMap.put(1001, 95);
    scoreMap.put(1004, 75);

    System.out.println("전체 출력: " + scoreMap);
    
    // TreeMap Methods
    System.out.println("가장 큰 학생 번호: " + scoreMap.firstKey());
    System.out.println("가장 작은 학생 번호: " + scoreMap.lastKey());
  }
}
