package sample.exercise1;

public class ascii {
	public static void main(String[] args)
	{
		int i =1;

		do
		{
		System.out.print((char)i+"\t");
		if (i % 10 == 0)
		System.out.println("");
		i++;
		}while (i <=122);

	}

}
