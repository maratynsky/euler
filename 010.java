import java.math.BigInteger;
import java.util.BitSet;
import java.util.concurrent.atomic.LongAdder;

/**
 * Created by maratynsky on 18/04/16.
 */
public class euler10 {

  /**
   * Sieve of Eratosthenes
   *
   * @param args
   */
  public static void main(String[] args) {
    long s = System.currentTimeMillis();
    final int n = 2_000_000;
    BitSet sieve = new BitSet(n);
    int p = 2;
    while (p * p <= n) {
      for (int i = p * p; i <= n; i += p) {
        sieve.set(i);
      }
      boolean found = false;
      for (int i = p + 1; i < n; i++) {
        if (!sieve.get(i)) {
          p = i;
          found = true;
          break;
        }
      }
      if (!found) {
        break;
      }
    }

    LongAdder longAdder = new LongAdder();
    for (int i = 0; i < n; i++) {
      if (!sieve.get(i)) {
        longAdder.add(i);
      }
    }
    System.out.println(longAdder.longValue() - 1);
    System.out.println(System.currentTimeMillis() - s);
  }
}
