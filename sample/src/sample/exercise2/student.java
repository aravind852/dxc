package sample.exercise2;

public class student {
String name;
int age;
String address;

student(String name,int age,String address){
	this.name="unknown";
	this.age=0;
	this.address="not avaliable";
	}
	public void setinfo(int age,String name)
	{
	this.name=name;
	this.age=age;
	}
	public void setinfo(int age ,String name,String address)
	{
	this.name=name;
	this.age=age;
	this.address=address;
	}
	public void display()
    {
        System.out.println("Student age is: " + name + " "
                           + "and Student name is: "
                           + age+ " " +" student address is"+address);
        System.out.println();
    }
	}
class hello{
	

public static void main(String args[]) {
	student[] arr=new student[10];
	
	arr[0] = new student("aravind",21,"hyderabad");
	arr[1] = new student("aravind",20,"hyderabad");
	arr[2] = new student("aravind",25,"hyderabad");
	arr[3] = new student("aravind",28,"hyderabad");
	arr[4] = new student("aravind",25,"hyderabad");
	arr[5] = new student("aravind",26,"hyderabad");
	arr[6] = new student("aravind",42,"hyderabad");
	arr[7] = new student("aravind",51,"hyderabad");
	arr[8] = new student("aravind",32,"hyderabad");
	arr[9] = new student("aravind",18,"hyderabad");
	for(int i=0;i<10;i++) {
		arr[i].display();
	}

}
}