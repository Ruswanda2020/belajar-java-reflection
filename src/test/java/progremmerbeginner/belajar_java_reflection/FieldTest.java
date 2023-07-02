package progremmerbeginner.belajar_java_reflection;

import org.junit.jupiter.api.Test;
import progremmerbeginner.belajar_java_reflection.data.Person;

import java.lang.reflect.Field;

public class FieldTest {
    @Test
    void testGetField() {

        Class<Person> personClass=Person.class;
        Field[] declaredFields = personClass.getDeclaredFields();

        for(var field :declaredFields){
            System.out.println(field.getName()+" : "+field.getType());
        }
    }

    @Test
    void testGetFieldValue() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> person=Person.class;
        Field firstName=person.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Person person1=new Person("ruswanda","ganteng");
        String result = (String) firstName.get(person1);
        System.out.println(result);

        Person person2=new Person("wanda","adi");
        String result2 = (String) firstName.get(person2);
        System.out.println(result2);
    }

    @Test
    void testSetFieldValue() throws IllegalAccessException, NoSuchFieldException {
        Class<Person> person=Person.class;
        Field firstName=person.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Person person1=new Person("ruswanda","ganteng");
        firstName.set(person1,"dika");//person1.setFirstName("dika");
        System.out.println(person1.getFirstName());

        Person person2=new Person("wanda","adi");
        firstName.set(person2,"danisa");//person2.setFirstName("danisa");
        System.out.println(person2.getFirstName());
    }
}
