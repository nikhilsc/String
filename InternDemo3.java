public class InternDemo3
{
	public static void main(String args[])
	{
		String s1="hello";
		String s3=new String("hello");		

		// here if I want to check s1 and s3 equality
		System.out.println(s1.equals(s3));  // true
		System.out.println(s1==s3);   // false
		System.out.println(s1==s3.intern());

				//2000   2000
		

	}
}

/*
When the intern method is invoked, if the pool already contains a string equal to "this" String object as determined by the equals(Object) method, then the string from the pool is returned. 
*/