package set0;

import java.util.*;

public class POJ_3030 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String out = "";
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt() - in.nextInt();
            if (a == b) {
                out += "does not matter\n";
            } else if (a < b) {
                out += "advertise\n";
            } else {
                out += "do not advertise\n";
            }
        }
        System.out.print(out);
    }

}
