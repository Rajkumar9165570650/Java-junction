package polymorphism;
class Demo{
	public Demo() {
		this(12,23,45);
		System.out.println("No argument constuctor:");
	}
	public Demo(int a,int b) {
		System.out.println("a and b"+a+" "+b);
	}
	public Demo(int a,int b,int c) {
		this(12,12);
		System.out.println("a and b"+a+" "+b+" "+c);
	}

}

public class Constructor_Overloding {

	public static void main(String[] args) {
		Demo a=new Demo();
		
	}

}
