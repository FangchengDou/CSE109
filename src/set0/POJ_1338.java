package set0;

import java.util.PriorityQueue;
import java.util.Scanner;

public class POJ_1338 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n != 0) {
            PriorityQueue<Long> q = new PriorityQueue<Long>();
            q.add(1L);
            Long last = 0L;
            for (int i = 0; i < n - 1; i++) {
                Long temp = q.poll();
                while (temp.equals(last)) {
                    temp = q.poll();
                }
                last = temp;
                q.add(temp * 2);
                q.add(temp * 3);
                q.add(temp * 5);
            }
            System.out.println(q.poll());
            n = in.nextInt();
        }
    }
}
