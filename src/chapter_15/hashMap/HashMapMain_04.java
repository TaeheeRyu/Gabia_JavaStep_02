package chapter_15.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapMain_04 {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<String, Integer>();

    map.put("apple", 0);
    map.put("banana", 20);
    map.put("grape", 30);

    System.out.println("======= 상품 재고 출력 =======");
    for (Map.Entry<String, Integer> entry : map.entrySet()) System.out.println(entry.getKey() + " : " + entry.getValue());
    System.out.println("============================");

    Scanner scan = new Scanner(System.in);
    System.out.println("재고를 조회할 상품명을 입력하세요!");
    String product = scan.next();

    if (map.containsKey(product)) {
      System.out.println(product + "의 재고는: " + map.get(product) + "개 입니다.");
    } else System.out.println("해당 상품은 재고에 없습니다.");

    System.out.print("\n재고를 업데이트할 상품명을 입력하세요: ");
		String updateProduct = scan.next();

    if (!map.containsKey(updateProduct)) {
      System.out.println("해당 상품의 재고를 등록합니다.");
      System.out.println("추가할 수량을 입력하세요: ");

      int additionalStock = scan.nextInt();
      map.put(updateProduct, additionalStock);
      System.out.println(updateProduct + "의 재고가 " + additionalStock + "개로 등록되었습니다.");
      
    } else {
      System.out.println(updateProduct + "의 현재 재고는: " + map.get(updateProduct) + "개 입니다.");
      System.out.print("추가할 수량을 입력하세요: ");

      int additionalStock = scan.nextInt();
      int newStock = map.get(updateProduct) + additionalStock;
      
      map.put(updateProduct, newStock);
      System.out.println(updateProduct + "의 재고가 " + newStock + "개로 업데이트되었습니다.");
    }

    for (Map.Entry<String, Integer> entry : map.entrySet()) System.out.println(entry.getKey() + " : " + entry.getValue());
  }
}
