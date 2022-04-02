package set0;

import java.util.*;

public class POJ_3096 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String output = "";
        String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while (true) {
            String s = in.nextLine();
            if (s.equals("*")) {
                break;
            }
            boolean bb = true;
            for (int i = 1; i < s.length() - 1; i++) {
                boolean[][] b = new boolean[26][26];
                for (int j = 0; j + i < s.length(); j++) {
                    if (b[letter.indexOf(s.substring(j, j + 1))][letter.indexOf(s.substring(i + j, i + j + 1))]) {
                        bb = false;
                    } else {
                        b[letter.indexOf(s.substring(j, j + 1))][letter.indexOf(s.substring(i + j, i + j + 1))] = true;
                    }
                }
            }
            if (bb) {
                output += s + " is surprising.\n";
            } else {
                output += s + " is NOT surprising.\n";
            }
        }
        System.out.print(output);
    }
}
