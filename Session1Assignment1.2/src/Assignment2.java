/*Write a program to print the result of the following expressions provided the integer variable a is
20 and b is 10.
int b= a-- - --a;
int c=a--;
int d=a>>2;
int e=a&b;
*/
public class Assignment2 {
	
		public static void main (String args[]){
		
		int a=20, b=10, c, d, e;
		
		b=a-- - --a;
		System.out.println("b= "+b);    //output b=2
		
		c=a--;
		System.out.println("c= "+c);   //output c=18
		
		d=a>>2;
		System.out.println("d= "+d);   //output d=4
		
		e=a&b;
		System.out.println("e= "+e);   //output e=0
		
	}

}
