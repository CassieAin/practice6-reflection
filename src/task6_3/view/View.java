package task6_3.view;

import task6_3.controller.ClassManipulation;

import java.lang.reflect.*;

public class View {
    private ClassManipulation classManipulation;

    public View() {
        try {
            classManipulation = new ClassManipulation();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    public void invokeSetter() {
        try {
            classManipulation.invokeSetter();
            System.out.println("Setter method invoked.");
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void invokeGetter()  {
        try {
            System.out.println("Get value of the field: " + classManipulation.invokeGetter());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void invokeToString() {
        try {
            System.out.println("ToString: " + classManipulation.invokeToString());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void invokeIncrement(){
        try {
            System.out.println("Incremented value of the field: " + classManipulation.invokeIncrement());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void invokeDecrement()  {
        try {
            System.out.println("Decremented value of the field: " + classManipulation.invokeDecrement());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
