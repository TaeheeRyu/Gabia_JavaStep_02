package chapter_14.stack;

import java.util.*;

public class StackTest_02 {
  public static void main(String[] args) {
    MyStack stack = new MyStack();

    stack.push("A");
    stack.push("B");
    System.out.println(stack.pop());
    stack.push("C");
    System.out.println(stack.pop());
    System.out.println(stack.pop());

    System.out.println(stack);
  }
}


class MyStack {
  private ArrayList<String> arrayStack = new ArrayList<String>();

  public void push(String data) { arrayStack.add(data); }
  public String pop() {
    int len = arrayStack.size();

    if (len == 0) return null;

    return arrayStack.remove(len - 1);
  }

  @Override
  public String toString() {
    return "MyStack [arrayStack=" + arrayStack + "]";
  }
}