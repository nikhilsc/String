public class IgnoreCaseDemo
{
	public static void main(String args[])
	{
		String s1="hello";
		String s2="Hello";

		System.out.println(s1.equals(s2));  // false
		System.out.println(s1.equalsIgnoreCase(s2));  // true
	}
}