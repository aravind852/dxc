package sample.exercise1;
import java.util.*;

public class voting {
	public static void main(String args[]) {
		System.out.println("What is your age??");
		
		int age;
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
	if (age>=18)
			{
		System.out.println(" you are eliible for voting");
			}
	else {
		System.out.println("You are not eligible for voting");
	}

}
}
