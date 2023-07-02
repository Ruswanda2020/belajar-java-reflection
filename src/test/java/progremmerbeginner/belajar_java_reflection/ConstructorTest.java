package progremmerbeginner.belajar_java_reflection;

import org.junit.jupiter.api.Test;
import progremmerbeginner.belajar_java_reflection.data.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorTest {
    @Test
    void testConstructor() throws ClassNotFoundException {
        Class<?> person =Class.forName("progremmerbeginner.belajar_java_reflection.data.Person");
        Constructor<?>[] constructors = person.getConstructors();

        for (var constructor:constructors){
            System.out.println("counstructors : "+constructor);
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (var parameter :parameterTypes){
                System.out.println("parameter type : "+parameter.getName());
            }

            System.out.println("===============");
        }
    }

    @Test
    void testCreateObjUsingConstructor() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> personClass = Class.forName("progremmerbeginner.belajar_java_reflection.data.Person");

        Constructor<?> constructor=personClass.getConstructor();
        Constructor<?> constructorParameter = personClass.getConstructor(String.class, String.class);

        Person person= (Person) constructor.newInstance();
        Person person1= (Person) constructorParameter.newInstance("wanda","nugraha");

        System.out.println(person);
        System.out.println(person1);

    }
}
