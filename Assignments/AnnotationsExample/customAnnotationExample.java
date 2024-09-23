package AnnotationsExample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

import GenericClassAndInterfaceExamples.Test;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnotation{
	String teacher() default "Omkar";
	String subject();
}


public class customAnnotationExample {

	@TestAnnotation(teacher="Arjun",subject="Maths")
	void method1() {
		System.out.println("Method1");
	}
	
	@TestAnnotation(teacher="Mayur",subject="Science")
	void method2() {
		System.out.println("Method2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				Method m = customAnnotationExample.class.getDeclaredMethod("method1");
				TestAnnotation personData = (TestAnnotation) m.getAnnotation(TestAnnotation.class);
				if(personData!=null) {
					System.out.println("Name :- "+personData.teacher());
					System.out.println("Subject :- "+personData.subject());
				}
		} 
		catch (NoSuchMethodException e) {
			System.out.println("NoSuchMethodException");
		}
	
	}

}
