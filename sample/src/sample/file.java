package exercise3;
import java.io.*;
public class file {
	
	public static void main(String args[])  
	{  
	try  
	{  
	File f=new File("D:\\test.txt");    
	FileReader fr=new FileReader(f);     
	BufferedReader b=new BufferedReader(fr);   
	StringBuffer s=new StringBuffer();      
	String line;  
	while((line=b.readLine())!=null)  
	{  
	s.append(line);        
	s.append("\n");        
	}  
	fr.close();     
	System.out.println("Inside file");  
	System.out.println(s.toString());     
	}  
	catch(IOException e)  
	{  
	e.printStackTrace();  
	}  
	}  
	}