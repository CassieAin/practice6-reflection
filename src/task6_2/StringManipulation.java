package task6_2;

import java.lang.reflect.Field;
import java.util.Scanner;

public class StringManipulation {

    public StringManipulation(){

    }

    private static void changeStringValue(String inputString, String changedString){
        try {
            Field field = String.class.getDeclaredField("value");
            field.setAccessible(true);
            field.set(inputString, changedString.toCharArray());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void changeDefinedString(String inputString, String changedString){
        changeStringValue(inputString, changedString);
        System.out.println("\nDefined string changed: " + inputString);
    }

    public static void changeInputString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput string value, please:");
        String input = scanner.nextLine();
        System.out.println("\nInput the value to change to, please:");
        String changeField = scanner.nextLine();
        changeStringValue(input, changeField);
        System.out.println("\nChanged string now: " + input);
    }

}
