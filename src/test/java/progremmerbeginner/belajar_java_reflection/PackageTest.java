package progremmerbeginner.belajar_java_reflection;

import org.junit.jupiter.api.Test;
import progremmerbeginner.belajar_java_reflection.data.Person;

import java.util.Arrays;

public class PackageTest {
    @Test
    void getPackage() {
        Class<Person> personClass = Person.class;

        Package aPackage = personClass.getPackage();

        System.out.println(aPackage.getName());
        System.out.println(Arrays.toString(aPackage.getAnnotations()));

    }
}
