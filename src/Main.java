public class Main {

    static void triangularNumber(int n) {
        int tN = 0;
        for (int i = 1; i <= n; i++) {
            tN += i;
        }
        System.out.println(tN);
    }

    static int triangularNumberRecursion(int n) {
        if (n == 1) return 1;
        else return (n + triangularNumberRecursion(n - 1));
    }
    public static void main(String[] args) {
        triangularNumber(10);
        System.out.println(triangularNumberRecursion(10));


    }
}