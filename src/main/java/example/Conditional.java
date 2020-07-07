package example;

import java.io.IOException;

public class Conditional {

    /**
     * Простое логическое "если".
     */
    public void operatorIf() {
        boolean condition = true;
        if (condition) {
            System.out.println(condition);
        }
    }

    /**
     * Главное указывать break и default.
     */
    public void operatorSwitch() {
        String operation = "1";

        switch (operation) {
            case "1" :
                break;
            case "s" :
                System.out.println("s");
                break;
            default:
                System.out.println("default");
                break;
        }
    }

    /**
     * Используется больше для лаконичности.
     */
    public void ternaryOperator() {
        int i = 10;
        String str = "";
//        (i < 10) ? str = "больше" : str = "меньше"; //неправильное применение
//
//        String str2 = (i < 10) ? "больше" : "меньше";
    }
}
