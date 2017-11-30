package task6_3.controller;

import task6_3.view.View;

public class MainController {

    public static void runApplication(){
        View view = new View();
        view.invokeToString();
        view.invokeSetter();
        view.invokeGetter();
        view.invokeIncrement();
        view.invokeDecrement();
    }
}
