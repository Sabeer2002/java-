import java.util.Scanner;

class ShapesMain {

	public static void main(String[] args) {
		Cone c=new Cone();
		c.input();
		c.process();
		c.output();
	}

}
class circle{
	double r,a;
	Scanner sc=new Scanner(System.in);
	void input() {
		System.out.println("Enter radius:");
		r=sc.nextDouble();
	}
	void process(){
		a=3.14*r*r;
	}
	void output() {
		System.out.println("Area of circle= "+a);
	}
}
class Cylinder extends circle{
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
		System.out.println("VOl of cone= "+v);
	}
}
class Cone extends Cylinder{
	double vol;
	void input() {
		super.input();
	}
	void process() {
		super.process();
		vol=v/3;
	}
	void output() {
		super.output();
		System.out.println("VOl of cone= "+vol);
	}
	
}