package chapter_14.stack;

import java.util.Stack;

public class StackTest_01 {
  public static void main(String[] args) {
    Object obj;
    Stack<Object> st = new Stack<Object>();

    if(st.empty()) {
      for (int i = 0; i <= 3; i++) st.push(new String("ㅇ?" + i));
    }

    obj = st.pop();
    System.out.println("pop()으로 꺼낸 객체: " + obj);
    System.out.println("현재 Top의 위치(peek): " + st.peek());
    System.out.println();
    System.out.println("현재 출력 데이터: " + st.pop());
    System.out.println("현재 Top의 위치(peek): " + st.peek());

    
  }
}
