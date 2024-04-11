package exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str1 = "some text";
        String str2 = "some text";
        String emptyStr = "";

        System.out.println(str1.equals(str2 + emptyStr));
    }
}
