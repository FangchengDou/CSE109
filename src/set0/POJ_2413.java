package set0;

import java.math.BigInteger;
import java.util.*;

public class POJ_2413 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        while (!a.equals(new BigInteger("0")) || !b.equals(new BigInteger("0"))) {
            BigInteger f1 = new BigInteger("1");
            BigInteger f2 = new BigInteger("2");
            int count = 0;
            while (f1.compareTo(a) == -1) {
                BigInteger temp = f2;
                f2 = f1.add(f2);
                f1 = temp;
            }
            while (f1.compareTo(b) != 1) {
                BigInteger temp = f2;
                f2 = f1.add(f2);
                f1 = temp;
                count++;
            }
            System.out.println(count);
            a = in.nextBigInteger();
            b = in.nextBigInteger();
        }
    }
}
