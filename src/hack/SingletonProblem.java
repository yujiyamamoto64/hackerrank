package hack;

/*
 * https://www.hackerrank.com/challenges/java-singleton/problem
 */

// In order to resolve it on hackerrank plataform 
// you have to change the name of the class
// from 'SingletonProblem' to 'Singleton'
public class SingletonProblem {

	private SingletonProblem() {
    }
    
    public String str;

    public static SingletonProblem getSingleInstance() {
         return new SingletonProblem();
    }
}
