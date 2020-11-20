public class InternDemo1
{
	public static void main(String args[])
	{
		String s1="hello";
		String s2=s1.intern();
		System.out.println(s1==s2);
	}
}

/*
When the intern method is invoked, if the pool already contains a string equal to "this" String object as determined by the equals(Object) method, then the string from the pool is returned. 
*/