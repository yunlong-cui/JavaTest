/**
 * 
 */
package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * @author Administrator
 *
 */
public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student student = new Student();
		Class<Student> c = Student.class;
		
		//Class<String> c = String.class;
		//获取Integer的字段
//		Field[] f = c.getDeclaredFields();
//		for (Field field : f) {
//			System.out.println(field.getName());
//		}
		//获取Method的方法
		Method[] methods = c.getDeclaredMethods();
		for (Method method : methods) {
			//int count = method.getParameterCount();
			//System.out.println("parameterCount is : " + count);
			
			Class returnType = method.getReturnType();
			String name = method.getName();
			System.out.print(returnType.getName() + " " + name + "(");
	
			Class[] paraType = method.getParameterTypes();
			for (Class class1 : paraType) {
				String paraName = class1.getName();
				System.out.print(paraName + " ");
			}
			
			
//			Parameter[] paras = method.getParameters();
//			for (Parameter parameter : paras) {
//				//parameter.get
//				//System.out.print(paraName + " ");
//			}
			System.out.println(")");
		}
		
		//获取构造函数
		Constructor<?>[] constructors =  c.getConstructors();
		for (Constructor<?> constructor : constructors) {
			String cName = constructor.getName();
			System.out.print(cName + " (");
			Class[] conParaTypesClasses =  constructor.getParameterTypes();
			for (Class class1 : conParaTypesClasses) {
				String conParaTypeName = class1.getName();
				System.out.print(conParaTypeName + " ");
			}
			System.out.println(")");
		}
	}

}

class Student 
{
	private int id;
	private String cardId;
	public int age;
	public String name;
	
	public Student() {
		this.name = "cuiyunlong";
		this.cardId = "00001";
	}
	
	public Student(String name) {
		this.name = name;
		this.cardId = "00001";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int addAge(int age) {
		int newAge = this.age + age;
		return newAge;
	}
}
