import java.util.Scanner;

class Complex {
	int rp, ip;
	Scanner sc = new Scanner(System.in);

	void input() {
		System.out.println("Enter rp,ip");
		rp = sc.nextInt();
		ip = sc.nextInt();
	}

void display(){
if(ip>0){
System.out.println(rp+"+"+ip+"i");
}else{
System.out.println(rp+" "+ip+"i");
}

	void process(Complex a, Complex b) {
		rp = a.rp + b.rp;
		ip = a.ip + b.ip;
	}
}

class Main {
	public static void main(String... arg) {
		Complex a = new Complex();
		Complex b = new Complex();
		Complex c = new Complex();
		a.input();
		b.input();
		c.process();
		c.output();
	}
}