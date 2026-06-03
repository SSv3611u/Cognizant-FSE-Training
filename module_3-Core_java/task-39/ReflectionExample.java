import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class GreetingService {
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            Class<?> serviceClass = Class.forName("GreetingService");
            Object service = serviceClass.getDeclaredConstructor().newInstance();

            for (Method method : serviceClass.getDeclaredMethods()) {
                System.out.println("Method: " + method.getName());
                System.out.println("Parameter count: " + method.getParameterCount());
            }

            Method sayHello = serviceClass.getDeclaredMethod("sayHello", String.class);
            sayHello.invoke(service, "Reflection");
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException
                 | IllegalAccessException | InvocationTargetException ex) {
            System.out.println("Reflection error: " + ex.getMessage());
        }
    }
}
