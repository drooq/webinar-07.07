package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class ParseOnPattern {
    private static final Pattern ONLY_REAL_NUMBER = Pattern.compile("^[-+]?[0-9]+([.,][0-9]+)?$");

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("write number");
        String str = bf.readLine();
        if (ParseOnPattern.ONLY_REAL_NUMBER.matcher(str).matches()) {
            System.out.println(Double.parseDouble(str));
        } else {
            System.out.println("Not number");
        }
    }
}
