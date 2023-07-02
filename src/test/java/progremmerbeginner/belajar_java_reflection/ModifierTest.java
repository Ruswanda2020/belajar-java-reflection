package progremmerbeginner.belajar_java_reflection;

import org.junit.jupiter.api.Test;
import progremmerbeginner.belajar_java_reflection.data.Person;

import java.lang.reflect.Modifier;

public class ModifierTest {
    @Test
    void testModifier() {
        Class<Person> personClass = Person.class;

        System.out.println(Modifier.isPrivate(personClass.getModifiers()));
        System.out.println(Modifier.isPublic(personClass.getModifiers()));
        System.out.println(Modifier.isFinal(personClass.getModifiers()));
        System.out.println(Modifier.isStatic(personClass.getModifiers()));
        System.out.println(Modifier.isAbstract(personClass.getModifiers()));

    }
}
