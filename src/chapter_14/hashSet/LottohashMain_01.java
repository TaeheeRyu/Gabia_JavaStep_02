package chapter_14.hashSet;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class LottohashMain_01 {
  public static void main(String[] args) {
    // HashSet<Integer> lotto = new HashSet<Integer>();
    TreeSet<Integer> lotto = new TreeSet<Integer>();

    while (true) {
      int num = new Random().nextInt(45)+1;
      lotto.add(num);

      if (lotto.size() == 6) break;
    } System.out.println(lotto);
  }
}