package set1;

import java.util.Scanner;

public class UVA_133 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int m = in.nextInt();
        while (n != 0 && k != 0 && m != 0) {
            people one = new people(1);
            people temp;
            people l = one;
            for (int i = 2; i <= n; i++) {
                temp = new people(i);
                temp.last = l;
                l.next = temp;
                l = temp;
            }
            l.next = one;
            one.last = l;

            while (true) {

                for (int i = 1; i < k; i++) {
                    one = one.next;
                }
                for (int i = 1; i < m; i++) {
                    l = l.last;
                }
                if (one == l) {

                    p(one.number);
                    if (one.next == one) {
                        break;
                    }
                    one = one.next;
                    l = l.last;
                    one.last = l;
                    l.next = one;
                } else if (one.next == l) {
                    p(one.number);
                    p(l.number);
                    if (one == one.next.next) {
                        break;
                    }
                    one = l.next;
                    l = l.last.last;
                    one.last = l;
                    l.next = one;
                } else {
                    p(one.number);
                    p(l.number);
                    one = one.next;
                    one.last = one.last.last;
                    one.last.next = one;
                    l = l.last;
                    l.next = l.next.next;
                    l.next.last = l;
                }
                System.out.print(",");
            }
            System.out.println();
            n = in.nextInt();
            k = in.nextInt();
            m = in.nextInt();
        }
    }

    static void p(int n) {
        if (n < 10) {
            System.out.print("  " + n);
        } else if (n < 100) {
            System.out.print(" " + n);
        } else {
            System.out.print(n);
        }
    }
}

class people {
    people last;
    people next;
    int number;

    public people(int x) {
        last = null;
        next = null;
        number = x;
    }
}