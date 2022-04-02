package set0;

import java.util.*;

public class POJ_1917 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String output = "";
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            String l1 = in.nextLine();
            String l2 = in.nextLine();
            String[] s = new String[5];
            s[0] = l1.substring(0, l1.indexOf('<'));
            s[1] = l1.substring(l1.indexOf('<') + 1, l1.indexOf('>'));
            s[2] = l1.substring(l1.indexOf('>') + 1, l1.lastIndexOf('<'));
            s[3] = l1.substring(l1.lastIndexOf('<') + 1, l1.lastIndexOf('>'));
            s[4] = l1.substring(l1.lastIndexOf('>') + 1);
            output += s[0] + s[1] + s[2] + s[3] + s[4] + "\n";
            output += l2.replaceAll("\\...", s[3] + s[2] + s[1] + s[4]) + "\n";
        }
        System.out.print(output);
    }
}
