package assignment;
import java.util.*;
public class password{
		public static boolean isValid(String password)
		{
			if (!((password.length() >= 8)
				&& (password.length() <= 15))) {
				return false;
			}
			if (password.contains(" ")) {
				return false;
			}
			if (true) {
				int count = 0;
				for (int i = 0; i <= 9; i++) {

					String str1 = Integer.toString(i);

					if (password.contains(str1)) {
						count = 1;
					}
				}
				if (count == 0) {
					return false;
				}
			}
			if (!(password.contains("@") || password.contains("#")
				|| password.contains("!") || password.contains("~")
				|| password.contains("$") || password.contains("%")
				|| password.contains("^") || password.contains("&")
				|| password.contains("*") || password.contains("(")
				|| password.contains(")") || password.contains("-")
				|| password.contains("+") || password.contains("/")
				|| password.contains(":") || password.contains(".")
				|| password.contains(", ") || password.contains("<")
				|| password.contains(">") || password.contains("?")
				|| password.contains("|"))) {
				return false;
			}

			if (true) {
				int count = 0;

				for (int i = 65; i <= 90; i++) {

					char c = (char)i;

					String str1 = Character.toString(c);
					if (password.contains(str1)) {
						count = 1;
					}
				}
				if (count == 0) {
					return false;
				}
			}

			if (true) {
				int count = 0;
				for (int i = 90; i <= 122; i++) {

					char c = (char)i;
					String str1 = Character.toString(c);

					if (password.contains(str1)) {
						count = 1;
					}
				}
				if (count == 0) {
					return false;
				}
			}
			return true;
		}
		public static void main(String[] args)
		{

			Scanner sc=new Scanner(System.in);
			System.out.println("enter password");
			String s=sc.nextLine();
			if (isValid(s)) {
				System.out.println("valid password");
			}
			else {
				System.out.println("invalid");
			}
		}
	}

