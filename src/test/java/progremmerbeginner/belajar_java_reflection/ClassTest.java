package progremmerbeginner.belajar_java_reflection;

import org.junit.jupiter.api.Test;
import progremmerbeginner.belajar_java_reflection.data.Person;

public class ClassTest {
    @Test
    void createClass() throws ClassNotFoundException {
        Class<Person> personClass = Person.class;

        Class<?> personClass2 = Class.forName("progremmerbeginner.belajar_java_reflection.data.Person");

        Person person = new Person();
        Class<? extends Person> personClass3 = person.getClass();
    }

    @Test
    void testMethod() throws NoSuchMethodException {
        Class<Person> personClass = Person.class;

        System.out.println(personClass.getSuperclass());
        System.out.println(personClass.getClass());
        System.out.println(personClass.getInterfaces());
        System.out.println(personClass.getDeclaredConstructors());
        System.out.println(personClass.getFields());
        System.out.println(personClass.getPackage());
        System.out.println(personClass.getMethods());
        System.out.println(personClass.getSimpleName());
        System.out.println(personClass.getName());
        System.out.println(personClass.getModifiers());

    }
}
