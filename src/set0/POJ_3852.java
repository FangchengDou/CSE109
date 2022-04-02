package set0;

import java.util.*;

public class POJ_3852 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String output = "";
        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }

            output += num(n, in) + "\n";
        }
        System.out.print(output);
    }

    static int num(int n, Scanner in) {
        String[] ss = new String[n];
        in.nextLine();
        for (int i = 0; i < n; i++) {
            ss[i] = in.nextLine();
        }
        int times = 0;
        boolean b = true;
        while (b) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (ss[i].equals(ss[j])) {
                        return times-1;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if (ss[i].length() == 1) {
                    return times;
                } else {
                    ss[i] = ss[i].substring(1);
                }

            }
            times++;
        }
        return times;
    }
}
