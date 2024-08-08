import java.util.Scanner;
class College{
	String college_name;
	Scanner sc=new Scanner(System.in);
	void input() {
		System.out.println("Enter the college name:");
		college_name=sc.nextLine();
	}
	void output() {
		System.out.println("==============");
		System.out.println("College details");
		System.out.println("College name= "+college_name);
	}
}
class Departments extends College{
	String dept_name;
	int dept_no;
	String dept_hod;
	void input() {
		super.input();
		System.out.println("Enter Dept name,no,hod:");
		dept_name=sc.nextLine();
		dept_no=sc.nextInt();
		dept_hod=sc.next();		
	}
	void output() {
		super.output();
		System.out.println("Dept name= "+dept_name);
		System.out.println("Dept no= "+dept_no);
		System.out.println("Dept hod= "+dept_hod);
	}
}
class Students extends Departments{
	int rollno;
	String name;
	double cgpa;
	void input() {
		super.input();
		System.out.println("Enter student rollno,name,cgpa:");
		rollno=sc.nextInt();
		name=sc.next();
		cgpa=sc.nextDouble();
	}
	void output() {
		super.output();
		System.out.println("Stud rollno= "+rollno);
		System.out.println("Stud name = "+name);
		System.out.println("Stud cgpa= "+cgpa);
	}
}
class MultilevelInheritence {

	public static void main(String[] args) {
		Students s=new Students();
		s.input();
		s.output();
	}

}