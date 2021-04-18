package sample.exercise2;
import java.util.*;
public class rectangle {
	int width;
	int height;
	int area() {
		return width*height;
	}
		public static void main(String args[]) {
			rectangle myrect= new rectangle();
			myrect.width=40;
			myrect.height=50;
			System.out.println(" area of rectangle is "+myrect.area());
	
		}
		
	}

