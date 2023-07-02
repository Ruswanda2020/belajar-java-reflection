package progremmerbeginner.belajar_java_reflection;

import org.junit.jupiter.api.Test;
import progremmerbeginner.belajar_java_reflection.data.Person;

public class SuperClassTest {
    @Test
    void testGetSuperClass() {
        Class<Person> personClass = Person.class;
        System.out.println(personClass);

        Class<? super Person> objClass = personClass.getSuperclass();
        System.out.println(objClass);

        Class<? super Person> superclass = objClass.getSuperclass();
        System.out.println(superclass);
    }
}
