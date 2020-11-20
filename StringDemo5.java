public class StringDemo5
{
	public static void main(String args[])
	{
		// two ways to create String

		String s1="hello";
		String s2=new String("hello");

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);

		String s3="hello";

		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);

		String s4=new String("hello");
		s3="world";
	}
}
		

