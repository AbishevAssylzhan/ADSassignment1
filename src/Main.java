import java.util.Scanner;

public class Main {

    // T1
    static void digits(int n) {
        if (n < 10) {
            System.out.println(n);
        }
        else {
            digits(n / 10);
            System.out.println(n % 10);
        }
    }

    // T2
    static int sum(int[] a, int i) {
        if (i == a.length) return 0;
        return a[i] + sum(a, i + 1);
    }

    // T3
    static boolean prime(int n, int i) {
        if (n <= 1) return false;
        if (i == n) return true;
        if (n % i == 0) return false;
        return prime(n, i + 1);
    }

    // T4
    static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }

    // T5
    static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    // T6
    static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // T7
    static void reverse(int[] a, int i) {
        if (i == a.length) return;
        reverse(a, i + 1);
        System.out.print(a[i] + " ");
    }

    // T8
    static boolean check(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return check(s, i + 1);
    }

    // T9
    static int count(String s) {
        if (s.equals("")) return 0;
        return 1 + count(s.substring(1));
    }

    // T10
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // T1
        digits(sc.nextInt());

        // T2
        int n = sc.nextInt();
        int[] a = new int[n];
        read(sc, a, 0);
        System.out.println((double) sum(a, 0) / n);

        // T3
        int x = sc.nextInt();
        if (prime(x, 2)) System.out.println("Prime");
        else System.out.println("Composite");

        // T4
        System.out.println(fact(sc.nextInt()));

        // T5
        System.out.println(fib(sc.nextInt()));

        // T6
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(power(p, q));

        // T7
        int k = sc.nextInt();
        int[] b = new int[k];
        read(sc, b, 0);
        reverse(b, 0);
        System.out.println();

        // T8
        if (check(sc.next(), 0)) System.out.println("Yes");
        else System.out.println("No");

        // T9
        System.out.println(count(sc.next()));

        // T10
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.println(gcd(a1, b1));
    }


    static void read(Scanner sc, int[] a, int i) {
        if (i == a.length) return;
        a[i] = sc.nextInt();
        read(sc, a, i + 1);
    }
}