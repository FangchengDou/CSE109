package set0;

import java.util.*;

public class POJ_2719 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        while (!n.equals("0")) {
            System.out.print(n);
            n = n.replace('5', '4');
            n = n.replace('6', '5');
            n = n.replace('7', '6');
            n = n.replace('8', '7');
            n = n.replace('9', '8');
            System.out.print(": " + Integer.parseInt(n, 9) + "\n");
            n = in.nextLine();
        }

    }
}
