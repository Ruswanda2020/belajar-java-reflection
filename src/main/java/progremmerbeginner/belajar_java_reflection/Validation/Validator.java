package progremmerbeginner.belajar_java_reflection.Validation;

import progremmerbeginner.belajar_java_reflection.Annotetion.NotBlank;

import java.lang.reflect.Field;

public class Validator {

    public static void validateNotBlank(Object object) throws IllegalAccessException {

        //get class
        Class<?> aClass = object.getClass();

        //get all field
        Field[] declaredFields = aClass.getDeclaredFields();

        //iteret each field
        for (Field declaredField : declaredFields) {

            //get annotion notblank
            NotBlank notBlank= declaredField.getAnnotation(NotBlank.class);
            //check if @notblank is exist
            if (notBlank != null){

                declaredField.setAccessible(true);
                //get field value
               String value = (String) declaredField.get(object);

               if (notBlank.allowEmptyString()){
                   //allow empty string
                   //ignore
               }else {
                   //not allow empty string
                   value.trim();
               }
               //check if value is empty String
               if ("".equals(value)){
                   //throw eror
                   throw new RuntimeException(declaredField.getName()+"must not blank");
               }
            }


        }
    }
}
