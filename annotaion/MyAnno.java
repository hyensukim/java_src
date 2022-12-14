package annotaion;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.*;

//TYPE_USE : 모든 타입에 사용 가능, TYPE 뺴고 가능? 불가능
@Target({METHOD,TYPE,TYPE_USE})// import static ... ElementType 임포트 시, 생략가능(정적 상수는 이방법으로 많이 생략함)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {// implements java.lang.annotation.Annotation 생략(자동입력)
	String value() ;//annotation을 통한 추가적인 정보 제공을 위한 주석역할
	String[] value2() default {"값1","값2"};
//	int nums(int num1, int num2); // 추상메서드는 매개변수 사용 불가
//	T value2(); //타입 매개변수도 불가능함.
}
