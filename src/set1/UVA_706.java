package set1;

import java.util.Scanner;

public class UVA_706 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        while (s != 0 && n != 0) {
            String x = n + "";
            for (int i = 0; i < x.length(); i++) {
                if (i != 0) {
                    System.out.print(" ");
                }
                switch (x.charAt(i)) {
                    case '1':
                    case '4':
                        for (int j = 0; j < s + 2; j++) {
                            System.out.print(" ");
                        }
                        break;
                    default:
                        System.out.print(" ");
                        for (int j = 0; j < s; j++) {
                            System.out.print("-");
                        }
                        System.out.print(" ");
                }

            }
            System.out.println();
            for (int k = 0; k < s; k++) {
                for (int i = 0; i < x.length(); i++) {
                    if (i != 0) {
                        System.out.print(" ");
                    }
                    switch (x.charAt(i)) {
                        case '1':
                        case '2':
                        case '3':
                        case '7':
                            System.out.print(" ");
                            break;
                        default:
                            System.out.print("|");
                    }
                    for (int j = 0; j < s; j++) {
                        System.out.print(" ");
                    }
                    switch (x.charAt(i)) {
                        case '5':
                        case '6':
                            System.out.print(" ");
                            break;
                        default:
                            System.out.print("|");
                    }
                }
                System.out.println();

            }

            for (int i = 0; i < x.length(); i++) {
                if (i != 0) {
                    System.out.print(" ");
                }
                switch (x.charAt(i)) {
                    case '1':
                    case '7':
                    case '0':
                        for (int j = 0; j < s + 2; j++) {
                            System.out.print(" ");
                        }
                        break;
                    default:
                        System.out.print(" ");
                        for (int j = 0; j < s; j++) {
                            System.out.print("-");
                        }
                        System.out.print(" ");
                }

            }
            System.out.println();
            for (int k = 0; k < s; k++) {
                for (int i = 0; i < x.length(); i++) {
                    if (i != 0) {
                        System.out.print(" ");
                    }
                    switch (x.charAt(i)) {
                        case '1':
                        case '3':
                        case '4':
                        case '5':
                        case '7':
                        case '9':
                            System.out.print(" ");
                            break;
                        default:
                            System.out.print("|");
                    }
                    for (int j = 0; j < s; j++) {
                        System.out.print(" ");
                    }
                    switch (x.charAt(i)) {
                        case '2':
                            System.out.print(" ");
                            break;
                        default:
                            System.out.print("|");
                    }
                }
                System.out.println();
            }
            for (int i = 0; i < x.length(); i++) {
                if (i != 0) {
                    System.out.print(" ");
                }
                switch (x.charAt(i)) {
                    case '1':
                    case '4':
                    case '7':
                        for (int j = 0; j < s + 2; j++) {
                            System.out.print(" ");
                        }
                        break;
                    default:
                        System.out.print(" ");
                        for (int j = 0; j < s; j++) {
                            System.out.print("-");
                        }
                        System.out.print(" ");
                }

            }
            System.out.println();
            s = in.nextInt();
            n = in.nextInt();
            if (s == 0 && n == 0) {
                return;
            }
            System.out.println();
        }
    }
}
