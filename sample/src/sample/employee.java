package assignment;
import java.util.*;
public class employee {
	private int id = 0;
	private String name;
	private String department;
	private Date dateOfJoining;
	private int age;
	private int salary;
	emp() {
		this.id += 1;
	}
	emp(String name, String dept, Date date, int age, int salary)
	{
		this.name = name;
		this.department = dept;
		this.dateOfJoining = date;
		this.age = age;
		this.salary = salary;
	}
	void setName(String name) {
		this.name = name;
	}
	void setDepartment(String dept) {
		this.department= dept;
	}
	void setDateOfJoining(Date date) {
		this.dateOfJoining = date;
	}
	void setAge(int age) {
		this.age = age;
	}
	int getAge() {
		return age;
	}
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
	String getDepartment() {
		return department;
	}
	Date getDateOfJoining() {
		return dateOfJoining;
	}
	int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		String ans = String.format("%-15s %-30s %-30s %-10s %-10s\n", this.name, this.department, this.dateOfJoining, this.age, this.salary);
		return ans;
	}

}
class salaryComparator implements Comparator<emp>{
	public int compare(emp o1, emp o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary() != o2.getSalary()) {
			return o1.getSalary() - o2.getSalary();
		}
		return 0;
	}
}
class AgeComparator implements Comparator<emp>{

	public int compare(emp o1, emp o2) {
		// TODO Auto-generated method stub
		if(o1.getAge() != o2.getAge()) {
			return o1.getAge() + o2.getAge();
		}
		else {
			return o1.getSalary() + o2.getSalary();
		}
	}
}

public class Employee 
{
	public static void main(String[] args) throws ParseException 
	{
		Scanner in = new Scanner(System.in);
		ArrayList<emp> employees = new ArrayList<emp>();
		SimpleDateFormat obj = new SimpleDateFormat("dd-mm-yyyy");
		employees.add(new emp("Rohini", "DataAnalysis", obj.parse("10-10-2000"), 45, 90000));
		employees.add(new emp("Ranganathan", "Production", obj.parse("09-10-2000"), 45, 92000));
		employees.add(new emp("Pankaj", "Marketing", obj.parse("02-02-2002"), 38, 75000));
		System.out.println("1.Sort employees by salary");
		System.out.println("2.Sort employees by age and by date of\r\n" + 
				"joining");
		System.out.println("Enter Your Choice");
		int choice = in.nextInt();
		switch(choice)
		{
			case 1: {
						Collections.sort(employees, new salaryComparator());
						for (int i = 0; i < employees.size(); i++)
						{
							System.out.println(employees.get(i));
						}
						
						break;
					}
			case 2: {
						Collections.sort(employees, new AgeComparator());
						for (int i = 0; i < employees.size(); i++)
						{
							System.out.println(employees.get(i));
						}
						break;
					}
			default:
					break;
		}
	
	}
}

