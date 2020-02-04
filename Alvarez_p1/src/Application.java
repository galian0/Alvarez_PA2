import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		Encrypter Encrypter = new Encrypter();
		Decrypter Decrypter = new Decrypter();

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 4 digit number to be encrypted: ");
		int theNumb = input.nextInt();
		
		Encrypter.encrypt(theNumb);
		
		Decrypter.decrypt(theNumb);
	}
}
