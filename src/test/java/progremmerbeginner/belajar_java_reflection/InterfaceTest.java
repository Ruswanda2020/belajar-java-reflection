package progremmerbeginner.belajar_java_reflection;

import org.junit.jupiter.api.Test;
import progremmerbeginner.belajar_java_reflection.data.Namable;
import progremmerbeginner.belajar_java_reflection.data.Person;

import java.util.Arrays;

public class InterfaceTest {
    @Test
    void testClass() {
        Class<Namable> namableClass = Namable.class;

        System.out.println(namableClass.getName());
        System.out.println(namableClass.isInterface());
        System.out.println(namableClass.getDeclaredConstructors());
        System.out.println(Arrays.toString(namableClass.getDeclaredFields()));


    }

    @Test
    void testSuperInterface() {
        Class<Person> personClass = Person.class;
        System.out.println(Arrays.toString(personClass.getInterfaces()));

    }
}
