package chapter_14.stack;

import java.util.Stack;

public class CoinMain_03 {
  public static void main(String[] args) {
    Stack<Coin_03> sodaPop = new Stack<Coin_03>();

    sodaPop.push(new Coin_03(1000000));
    sodaPop.push(new Coin_03(500000));
    sodaPop.push(new Coin_03(100000));
    sodaPop.push(new Coin_03(50000));
    sodaPop.push(new Coin_03(10000));

    // System.out.println(sodaPop.isEmpty() ? "Stack is empty" : "Stack is not empty");
    while(!sodaPop.isEmpty()) {
      Coin_03 coin = sodaPop.pop();
      System.out.println("꺼내온 동전: " + coin.getValue() + "원");
    }0
  }
}
