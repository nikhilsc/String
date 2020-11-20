public class InternDemo4
{
	public static void main(String args[])
	{
		String s1=new String("hello");		

		String s2=s1.intern();  // "otherwise" scenario
		System.out.println(s1==s2);
		System.out.println(s2==s1.intern()); "when" scenario
	}
}

/*
When the intern method is invoked, if the pool already contains a string equal to "this" String object as determined by the equals(Object) method, then the string from the pool is returned. 
Otherwise, this String object is added to the pool and a reference to this String object is returned. 
*/