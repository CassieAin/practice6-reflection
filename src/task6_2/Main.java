package task6_2;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String initialString = "Some string";
        String changedString = "Some another string";
        StringManipulation.changeDefinedString(initialString, changedString);
        StringManipulation.changeInputString();
    }
}
