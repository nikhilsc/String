public class StringDemo2
{
	public static void main(String args[])
	{
		// String class has followed equals-hashcode contract

		String s1=new String("hello");
		String s2=new String("hello");

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(s1==s2);
	}
}
		

