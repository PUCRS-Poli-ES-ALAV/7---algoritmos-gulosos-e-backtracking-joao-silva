import java.util.ArrayList;
import java.util.List;

public class ProblemaDoTroco {
  public static void main(String[] args) {
    List<Integer> coins = new ArrayList<>();
    coins.add(100);
    coins.add(25);
    coins.add(10);
    coins.add(5);
    coins.add(1);

    int value = 289; 

    List<Integer> solution = solution(coins, value);
    System.out.println("Solução: " + solution);
    System.out.println("Número de moedas: " + solution.size());
  }

  public static List<Integer> solution(List<Integer> coins, int value) {
    List<Integer> result = new ArrayList<>();
    int iterations = 0;

    coins.sort((a, b) -> b - a);

    for (int coin : coins) {
      while (value >= coin) {
        value -= coin;
        result.add(coin);
        iterations++;
      }
    }

    System.out.println("Número de iterações: " + iterations);
    return result;
  }
}