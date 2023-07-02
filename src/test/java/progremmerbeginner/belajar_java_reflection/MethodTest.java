package progremmerbeginner.belajar_java_reflection;

import org.junit.jupiter.api.Test;
import progremmerbeginner.belajar_java_reflection.data.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodTest{
    @Test
    void testMethod() {

        Class<Person> person=Person.class;

        Method[] declaredMethods = person.getDeclaredMethods();
        for (var method: declaredMethods){
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
            System.out.println(method.getModifiers());
            System.out.println(method.getAnnotatedReturnType());
            System.out.println(Arrays.toString(method.getParameterTypes()));
            System.out.println(Arrays.toString(method.getExceptionTypes()));
            System.out.println("=========");
        }
    }

    @Test
    void testGetMethodValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Method getFirstName=personClass.getDeclaredMethod("getFirstName");

        Person person = new Person("WANDA","Dika");
        String firstName= (String) getFirstName.invoke(person);
        System.out.println(firstName);

    }
}
