package set1;

import java.util.Scanner;

class UVA_628 {
    public static void main(String[] args) {
        Scanner ipt = new Scanner(System.in);
        while (ipt.hasNextLine()) {
            String q = ipt.nextLine();
            int a = Integer.parseInt(q);
            String[] s = new String[1];
            if (a != 0) {
                s = new String[a];
            }

            for (int i = 0; i < a; i++) {
                s[i] = ipt.nextLine();
            }
            int b = Integer.parseInt(ipt.nextLine());
            String[] s2 = new String[1];
            if (b != 0) {
                s2 = new String[b];
            }

            for (int i = 0; i < b; i++) {
                s2[i] = ipt.nextLine();
            }
            System.out.println("--");
            for (String ss : s2) {
                for (String sss : help(ss, s)) {
                    System.out.println(sss);
                }
            }
        }
    }

    static String[] help(String pattern, String[] dic) {
        String[] out;
        if (pattern.length() == 1) {
            out = new String[1];
            out[0] = "";
        } else {
            out = help(pattern.substring(1), dic);
        }
        int o = out.length;
        int d = dic.length;
        String[] toReturn = new String[1];
        if (pattern.charAt(0) == '#') {
            toReturn = new String[o * d];
            for (int i = 0; i < o * d; i++) {
                toReturn[i] = dic[i / o] + out[i % o];
            }
        } else if (pattern.charAt(0) == '0') {
            toReturn = new String[10 * o];
            for (int i = 0; i < o * 10; i++) {
                toReturn[i] = i / o + out[i % o];
            }
        }

        return toReturn;
    }
}