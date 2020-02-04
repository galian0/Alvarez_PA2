
public class Decrypter {
	private int n; //instance variable
	 
	public void decrypt(int n) {
		this.n = n;
		int a = n / 1000;
		int b = (n % 1000) / 100;
		int c = (n % 100) / 10;
		int d = n % 10;
		//add 7 to each digit and find the remainder after dividing by 10
		a = (a + 3) % 10;
		b = (b + 3) % 10;
		c = (c + 3) % 10;
		d = (d + 3) % 10;
		//save a as e so you can swap it with c
		//save b as f so you can swap it with d
		int e = a;
		int f = b;
		a = c;
		b = d;
		c = e;
		d = f;
		System.out.printf("Your decrypted value is: %n%d%d%d%d%n", a,b,c,d);
	}
}

