package patterns;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.LambdaExpression;
//import org.eclipse.jdt.core.dom.*;
class test {


	
	interface FuncInterface{
		void abstractFunc(int x);
		
		default void normalFunc()
		{
			System.out.println("Hello, again!");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Hello, World!");
		
		FuncInterface fobj = (int x) -> System.out.println(2*x);
		
		fobj.abstractFunc(5);
		
		
	}
}
