package progremmerbeginner.belajar_java_reflection;

import org.junit.jupiter.api.Test;
import progremmerbeginner.belajar_java_reflection.data.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterTest {
    @Test
    void getParameter() {
        Class<Person> personClass=Person.class;
        for (var method:personClass.getDeclaredMethods()){
            Parameter[] parameters = method.getParameters();
            System.out.println(method.getName());
            for(var parameter:parameters){
                System.out.println("parameter name : "+parameter.getName());
                System.out.println("parameter type : "+parameter.getType());
            }
            System.out.println("=================");
        }
    }

    @Test
    void testInvokeMethodWithParameter() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Method setFirstName = personClass.getDeclaredMethod("setFirstName", String.class);

        Person person =new Person("wanda","wandi");
        setFirstName.invoke(person,"dika");
        System.out.println(person.getFirstName());


    }
}
