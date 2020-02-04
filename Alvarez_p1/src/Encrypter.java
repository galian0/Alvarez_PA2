
public class Encrypter {
	private int n; //instance variable
	 
	public void encrypt(int n) {
		this.n = n;
		int a = n / 1000;
		int b = (n % 1000) / 100;
		int c = (n % 100) / 10;
		int d = n % 10;
		//add 7 to each digit and find the remainder after dividing by 10
		a = (a + 7) % 10;
		b = (b + 7) % 10;
		c = (c + 7) % 10;
		d = (d + 7) % 10;
		//save a as e so you can swap it with c
		//save b as f so you can swap it with d
		int e = a;
		int f = b;
		a = c;
		b = d;
		c = e;
		d = f;
		System.out.printf("Your encrypted value is: %n%d%d%d%d%n", a,b,c,d);
	}
}
