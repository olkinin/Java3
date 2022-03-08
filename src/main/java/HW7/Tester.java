package HW7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Tester {

   public static int priorityMax=10;
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Calculator calculator = new Calculator(2, 5);
        start(calculator.getClass(), calculator);

    }

    public static void start(Class c, Calculator calculator) throws InvocationTargetException, IllegalAccessException {
        Method[] methods = Calculator.class.getDeclaredMethods();
        int counter = 0;
        for (Method m : methods) {
            if (m.isAnnotationPresent(BeforeSuite.class)) {
                System.out.println(m.invoke(calculator));
                counter++;
            }
        }
        if (counter != 1) {
            throw new RuntimeException("Error BeforeSuite");
        }
        int n = 1;
        while (n<priorityMax){
        for (Method m : methods) {
            if (m.isAnnotationPresent(Test.class)) {
                if (m.getAnnotation(Test.class).priority() == n) {
                    System.out.println(m.invoke(calculator));
                }
            }
        } n=n+1;}

    counter =0;
        for(
    Method m :methods)

    {
        if (m.isAnnotationPresent(AfterSuite.class)) {
            System.out.println(m.invoke(calculator));
            counter++;
        }
    }
        if(counter !=1)

    {
        throw new RuntimeException("Error AfterSuite");
    }
}
}







