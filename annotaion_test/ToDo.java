package annotaion_test;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;

@Repeatable(ToDos.class)
@Target(TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ToDo {
	String value();
}
