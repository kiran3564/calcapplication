package tests;

public class Instance {
	
	void m1() {
		System.out.println("hello worll");
	}
	Instance()
	{
		System.out.println("inside the constructor");
	}
	{
		System.out.println("insde the instance blowck");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instance a = new Instance();
		a.m1();
	}

}
