package progremmerbeginner.belajar_java_reflection;

import org.junit.jupiter.api.Test;
import progremmerbeginner.belajar_java_reflection.Validation.Validator;
import progremmerbeginner.belajar_java_reflection.data.Person;

public class AnnotetionTest {
    @Test
    void testValidateUsingAnnotetion() throws IllegalAccessException {

        Person person=new Person("wanda"," ");
        Validator.validateNotBlank(person);

    }
}
