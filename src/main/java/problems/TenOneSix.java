package problems;

/**
 * Задание 10.1.6
 *
 * Что будет напечатано в результате работы этой программы?
 */
public class TenOneSix {

    public static void main(String[] args) {
        int var1 = 5;
        int var2 = 4;
        System.out.println(doSomthing1(var1, 10, var2));
    }

    public static int doSomthing1(int a, int b, int c) {
        return a + doSomthing2(b * c, 4, 8);
    }

    public static int doSomthing2(int a, int b, int c) {
        return a * b / c;
    }
}
