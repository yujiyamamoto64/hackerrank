package hack;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/*
 * https://www.hackerrank.com/challenges/java-reflection-attributes/problem
 */

public class JavaReflectionAttributeProblem {

	public static void main(String[] args) throws ClassNotFoundException{
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods){
            methodList.add(method.getName());
        }
        
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}
