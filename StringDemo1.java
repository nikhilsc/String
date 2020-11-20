public class StringDemo1
{
	public static void main(String args[])
	{
		String s1=new String("hello");
		System.out.println(s1);

		// immutability
		String s2=s1.concat("world");
		System.out.println(s1+"\t"+s2);

	}
}