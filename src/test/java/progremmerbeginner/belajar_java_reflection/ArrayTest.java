package progremmerbeginner.belajar_java_reflection;

import org.junit.jupiter.api.Test;
import progremmerbeginner.belajar_java_reflection.data.Person;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {
    @Test
    void testArrayClass() {
        Class<String[]> stringArrayClass= String[].class;
        Class<int[]> intArrayClass = int[].class;
        Class<Person> personClass = Person.class;


        System.out.println(personClass.isArray()    );
        System.out.println(stringArrayClass.isArray());
        System.out.println(intArrayClass.isArray());
    }
    @Test
    void testArrayMember() {

        Class<String[]> stringArrayClass= String[].class;

        System.out.println(Arrays.toString(stringArrayClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(stringArrayClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(stringArrayClass.getDeclaredFields()));
        System.out.println(stringArrayClass.getComponentType());
    }

    @Test
    void testArrayManipuletion() {
        Class<String[]> stringArrayClass = String[].class;

        String[] array= (String[]) Array.newInstance(stringArrayClass.getComponentType(), 10);
        System.out.println(Arrays.toString(array));

        Array.set(array,0,"wanda dirgantara");
        Array.set(array,2,"nugraha dirgantara");
        Array.set(array,1,"andi dirgantara");


        System.out.println(Arrays.toString(array));
    }
}
