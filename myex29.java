//single inheritence;
import java.util.Scanner;


class Circle{
	double r,a;
	Scanner sc=new Scanner(System.in);
	void input() {
		System.out.println("Enter radius:");
		r=sc.nextDouble();
	}
	void process() {//a=pi*r*r(formula) 
		a=3.14*r*r; //pi value is 3.14
	}
	void output() {
		System.out.println("Area of circle= "+a);
	}
}

class Cylinder extends Circle{
	double v,h;
	void input() {
		super.input();
		System.out.println("Enter height:");
		h=sc.nextDouble();		
	}
	void process() {
		super.process();
		v=a*h;
	}
	void output() {
		super.output();
		System.out.println("volume of  cylinder= "+v);
	}
}
class SingleInheritence {

	public static void main(String[] args) {
		Cylinder c=new Cylinder();
		c.input();
		c.process();
		c.output();
	}

}