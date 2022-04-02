package set0;

import java.util.*;

class POJ_1477 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList l = new ArrayList();
        while (true) {
            int n = in.nextInt();
            int count = 0;
            if (n == 0) {
                break;
            }
            int sum = 0;
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                int temp = in.nextInt();
                nums[i] = temp;
                sum += temp;
            }
            int avg = sum / n;
            for (int i = 0; i < n; i++) {
                if (avg > nums[i]) {
                    count += avg - nums[i];
                }
            }
            l.add(count);

        }
        for (int i = 1; i <= l.size(); i++) {
            System.out.printf("Set #%d\n", i);
            System.out.printf("The minimum number of moves is %d.\n\n", l.get(i-1));
        }

    }
}