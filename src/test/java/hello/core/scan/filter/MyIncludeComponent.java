package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) //어디 붙냐라는건데 TYPE은 클래스레벨에 붙는거
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}
