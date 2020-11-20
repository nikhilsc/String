public class InternDemo2
{
	public static void main(String args[])
	{
		String s1="hello";
		String s3=new String("hello");		

		String s2=s3.intern();
		System.out.println(s1==s2);
	}
}

/*
When the intern method is invoked, if the pool already contains a string equal to "this" String object as determined by the equals(Object) method, then the string from the pool is returned. 
*/