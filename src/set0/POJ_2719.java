package set0;

import java.util.*;

public class POJ_2719 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String output = "";
        int n = in.nextInt();
        while (n != 0) {
            String n1 = Integer.toString(n);
            n1 = n1.replace('5', '4');
            n1 = n1.replace('6', '5');
            n1 = n1.replace('7', '6');
            n1 = n1.replace('8', '7');
            n1 = n1.replace('9', '8');
            output += n + ": " + Integer.parseInt(n1, 9) + "\n";
            n = in.nextInt();
        }
        System.out.print(output);
    }
}
