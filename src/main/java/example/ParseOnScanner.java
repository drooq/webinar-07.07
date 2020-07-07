package example;

import java.util.Scanner;

public class ParseOnScanner {

    /**
     * Проблема с точкой.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        System.out.println("write number");
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        }
        System.out.println(number);
    }
}
