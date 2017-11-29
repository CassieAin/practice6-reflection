package task6_3;

import task6_3.controller.ClassManipulation;
import task6_3.view.View;

import java.lang.reflect.*;

public class MainApplication {

    public static void main(String [] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        View view = new View();
        view.invokeToString();
        view.invokeSetter();
        view.invokeGetter();
        view.invokeIncrement();
        view.invokeDecrement();
    }
}
