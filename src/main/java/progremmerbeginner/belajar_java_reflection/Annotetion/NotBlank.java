package progremmerbeginner.belajar_java_reflection.Annotetion;

import java.lang.annotation.*;

@Documented
@Target({
        ElementType.FIELD
})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotBlank {

    boolean allowEmptyString() default false;

}
