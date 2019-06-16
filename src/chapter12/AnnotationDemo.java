package chapter12;

import java.lang.reflect.Field;

public class AnnotationDemo {
	
	@Valid(type="email",message="Invalid email")
	public String email;
	
	public static void printAnnotation(Object obj)
	{
		try {
			Field field = obj.getClass().getField("email");
			Valid anno = field.getAnnotation(Valid.class);
			//System.out.println("Anno "+anno);
			System.out.println("Anno type "+anno.type() +" message "+ anno.message());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public static void main(String[]args)
	{
		AnnotationDemo demo = new AnnotationDemo();
		printAnnotation(demo);
	}

}
