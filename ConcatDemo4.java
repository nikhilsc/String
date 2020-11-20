public class ConcatDemo4
{
	public static void main(String args[])
	{
		String s1="hello";
		final String s2="hel";
		System.out.println(s1==(s2+"lo"));

				// here compiler makes it "hello"
					
	}
}