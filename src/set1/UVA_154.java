package set1;

import java.util.ArrayList;
import java.util.Scanner;

public class UVA_154 {
    public static void main(String[] args) {
        // roygb
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        while (!s.equals("#")) {
            ArrayList<char[]> alist = new ArrayList<>();
            while (!s.equals("e")) {
                char[] temp = new char[5];
                for (int i = 0; i < 5; i++) {
                    switch (s.charAt(i * 4)) {
                        case 'r':
                            temp[0] = s.charAt(i * 4 + 2);
                            break;
                        case 'o':
                            temp[1] = s.charAt(i * 4 + 2);
                            break;
                        case 'y':
                            temp[2] = s.charAt(i * 4 + 2);
                            break;
                        case 'g':
                            temp[3] = s.charAt(i * 4 + 2);
                            break;
                        case 'b':
                            temp[4] = s.charAt(i * 4 + 2);
                            break;
                    }
                }
                alist.add(temp);
                s = in.nextLine();
            }
            int min = 0;
            int city = 0;
            for (int i = 0; i < alist.size(); i++) {
                int count = 0;
                for (int j = 0; j < 5; j++) {
                    for (int m = 0; m < alist.size(); m++) {
                        if (alist.get(m)[j] != alist.get(i)[j]) {
                            count++;
                        }
                    }
                }
                if (i == 0 || count < min) {
                    min = count;
                    city = i;
                }
            }
            System.out.println(city + 1);
            s = in.nextLine();
        }
    }
}
