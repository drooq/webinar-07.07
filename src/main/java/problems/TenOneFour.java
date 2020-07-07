package problems;

/**
 * Напишите публичный метод,который принимает в качестве аргумента строку с именем str1,
 * печатает её и возвращает её длину(int).
 *
 * Название метода будет getStringLength().
 */
public class TenOneFour {

    public static void main(String[] args) {
        String stringToCheck = "Учусь писать методы! Всё оказалось очень просто!";
        int length = TenOneFour.getStringLength(stringToCheck);
        System.out.println("String length = " + length);
    }

    public static int getStringLength(String str1) {
        return str1.length();
    }
}
