package set0;

import java.util.*;

class POJ_1004 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double d = 0;
        for (int i = 0; i < 12; ++i) {
            d += in.nextDouble();
        }
        System.out.printf("$%.2f\n", d / 12.0);
    }
}
