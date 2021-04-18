package sample.exercise1;
import java.util.*;

public class evenodd {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	int totalcase, eachcasevalue;
	totalcase = s.nextInt();
	int[][] arr = new int[totalcase][];
	for(int i=0;i<totalcase;i++)
	{
	    eachcasevalue = s.nextInt();
	    arr[i]= new int[eachcasevalue];
	    for(int j = 0;j<arr[i].length;j++)
	    {
	        arr[i][j]=s.nextInt();
	    }
	}

    for (int i=0;i<arr.length;i++) 
    {
        int even =0 ,odd=0;
        System.out.println("testcase" +i+ "with" +arr[i].length +"values");
        for(int j=0;j<arr[i].length;j++) 
        {
            System.out.println(arr[i][j]+"  ");
            if(arr[i][j]%2==0)
            {
                even++;
            }
            else {odd++;}
        }
        System.out.println("total even -" + even +" total odd -" + odd);
   }       
}

}