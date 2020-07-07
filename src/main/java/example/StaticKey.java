package example;

public class StaticKey {
    /**
     * Поле класса.
     */
    public String field = "default";
    /**
     * Статичноя поле класса.
     */
    public static String staticField = "static field";


    /**
     * Обьявляем всегда static.
     */
    public static void main(String[] args) {
        StaticKey.firstMethod();

        StaticKey obj = new StaticKey();
        obj.secondMethod();
        StaticKey.firstMethod();
    }

    /**
     * Статичный метод можно вызвать без объекта.
     */
    public static void firstMethod() {
        staticField = "new String";
        System.out.println("class");
    }

    /**
     * Метод можно вызвать только у объекта.
     */
    public void secondMethod() {
        System.out.println("obj");
    }
}
