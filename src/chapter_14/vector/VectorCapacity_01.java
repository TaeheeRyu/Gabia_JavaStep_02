package chapter_14.vector;

import java.util.*;

public class VectorCapacity_01 {
  public static void main(String[] args) {
    // 구버전(기본용량 10, 증가량 10)
    Vector<String> vector = new Vector<String>();
    // List<String> list =  Collections.synchronizedList(vector);

    System.out.println("초기 용량: " + vector.capacity());
    System.out.println("초기 크기: " + vector.size());
    System.out.println();

    vector.add("Apple");
    vector.add("Banana");
    vector.add("Cherry");

    System.out.println("초기 용량: " + vector.capacity());
    System.out.println("초기 크기: " + vector.size());
    System.out.println();

    for (int i = 0; i < 11; i++) vector.add("강상구 분신 Mk - " + i);

    // 용량 초과 시 기존 크기 2배 증가
		System.out.println("------------데이터 11개 증가 후 크기------------");
		System.out.println("초기 크기: " + vector.size());
		System.out.println("초기 용량: " + vector.capacity());
  }
}
