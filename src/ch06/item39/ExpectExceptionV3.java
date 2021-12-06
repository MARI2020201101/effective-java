package ch06.item39;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ExpectExceptionContainer.class)
public @interface ExpectExceptionV3 {
    Class<? extends Throwable> value();
}
