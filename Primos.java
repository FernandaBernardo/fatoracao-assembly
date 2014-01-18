import java.util.ArrayList;
import java.util.List;

public class Primos {
  public static int[] primeFactors(int numero) {
    //int n = numero;
    //int aux = 0;
    //int[] fatoresPrimos = new int[n];
    for (int i = 2; i <= n; i++) {
      while (n % i == 0) {
        //fatoresPrimos[aux] = i;
        n /= i;
        //aux++;
      }
    }
    return fatoresPrimos;
  }

  public static void main(String[] args) {
    System.out.println("Primefactors of 44");
    for (int integer : primeFactors(44)) {
      if (integer == 0) break;
      System.out.println(integer);
    }
  }
} 