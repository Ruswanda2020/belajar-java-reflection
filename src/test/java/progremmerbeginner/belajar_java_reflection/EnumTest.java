package progremmerbeginner.belajar_java_reflection;

import org.junit.jupiter.api.Test;
import progremmerbeginner.belajar_java_reflection.data.Gander;

import java.util.Arrays;

public class EnumTest {
    @Test
    void testEnum() {
        Class<Gander> ganderClass = Gander.class;

        System.out.println(ganderClass.getName());
        System.out.println(ganderClass.getSuperclass());
        System.out.println(Arrays.toString(ganderClass.getEnumConstants()));
        System.out.println(ganderClass.isEnum());
        System.out.println(Arrays.toString(ganderClass.getDeclaredFields()));
        System.out.println(Arrays.toString(ganderClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(ganderClass.getDeclaredMethods()));

    }
}
