// StringBuilder is a mutable class. that means any operation is //performed on an instance , will modify the same instance.

public class StringBuilderDemo
{
	public static void main(String args[])
	{
		StringBuilder sb=new StringBuilder("hello");
		System.out.println(sb);
		sb.append(" world");
		System.out.println(sb);
	}
}