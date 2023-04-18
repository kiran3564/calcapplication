package tests;

public class Thhss {
	
	void m1() {
		System.out.println("m1-q");
	}
	void m2() {
	m1();
	this.m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thhss tss = new Thhss();
		//tss.m1();
		tss.m2();
				

	}

}
