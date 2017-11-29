package task6_3.controller;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassManipulation {
    private Class<?> classInstance;
    private Object classObject;

    public ClassManipulation() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        classInstance = Class.forName("task6_3.model.UnaryOperation");
        classObject = classInstance.newInstance();
    }

    public void getConstructorsData() throws ClassNotFoundException {
        Constructor<?>[] constructors = classInstance.getConstructors();
        int i = 0;
        for (Constructor<?> constructor : constructors) {
            System.out.print("Constructor " + (++i) + " : ");
            Class<?>[] parametersTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parametersTypes) {
                System.out.print(parameterType.getName() + " ");
            }
            System.out.println();
        }
    }

    public void getFieldsData() throws ClassNotFoundException, NoSuchFieldException {
        System.out.println("\nClass name: " + classInstance.getName());
        Field valueField =  classInstance.getDeclaredField("value");
        System.out.println("Field name: " + valueField.getName());
        System.out.println("Field type: " + valueField.getType());
    }

    public void invokeSetter() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?>[] paramsType = new Class<?>[] { double.class };
        Method setterMethod = classInstance.getMethod("setValue", paramsType);
        setterMethod.invoke(classObject, 12);
    }

    public double invokeGetter() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method getterMethod = classInstance.getMethod("getValue");
        return (double) getterMethod.invoke(classObject, null);
    }

    public String invokeToString()  throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method toStringMethod = classInstance.getMethod("toString");
        return (String) toStringMethod.invoke(classObject, null);
    }

    public double invokeIncrement()  throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method incrementMethod = classInstance.getMethod("increment");
        return (double) incrementMethod.invoke(classObject, null);
    }

    public double invokeDecrement()  throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method decrementMethod = classInstance.getMethod("decrement");
        return (double) decrementMethod.invoke(classObject, null);
    }

}
