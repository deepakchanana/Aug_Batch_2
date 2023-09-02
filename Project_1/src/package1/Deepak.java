package package1;
 
 // {   } --------boundary(body) of the class
public class Deepak 
{  
   int a; // it will store int value
   
   public void abc()  // () indicate this is a method
   {      // boundary of the method(method name---abc)
	   System.out.println("welcome to all of you");
   }
   public static void main(String[] args) // piller2
   {
	Deepak ob=new Deepak();  // piller3
	ob.abc();  // reference_variable.methodname(); piller4
	ob.abc();
	ob.a=223;
	System.out.println("value of a "+ob.a);
	ob.a=445;
	System.out.println("value of a "+ob.a);
   }
}
