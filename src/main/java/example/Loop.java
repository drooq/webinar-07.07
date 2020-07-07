package example;

import java.util.ArrayList;

public class Loop {

    /**
     * Нужно выполнить определённо кол-во раз.
     */
    public void operatorFor() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    /**
     * Нужно выполнить пока верно условие.
     */
    public void operatorWhile() {
        int i = 45;
        while (i != 350) {
            System.out.println(i);
            i++;
        }
    }

    /**
     * Нужно выполнить один раз и пока верно условие.
     */
    public void operatorDoWhile() {
        boolean exit = false;
        do {
            System.out.println();
        } while (exit);
    }
}
