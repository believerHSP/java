package p3;

public class Bank {

	private Bank() {
		System.out. println("Inside private constructor of Bank");
	}
	
	public static Bank object() {
		
		return new Bank();
	}
}
