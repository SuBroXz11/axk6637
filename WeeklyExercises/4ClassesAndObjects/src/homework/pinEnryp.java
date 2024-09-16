package homework;

import java.util.Scanner;
import java.util.Random;

public class pinEnryp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random= new Random();
		System.out.print("Enter a 4 digit pin number to encrypt: ");
		int pin = scan.nextInt();
		
		int randint= random.nextInt(64536 - 1000) + 1000;
		
		String hexPin=Integer.toHexString(pin);
		String randomDecimal=Integer.toHexString(randint);
		
		String encryptedPin=randomDecimal+hexPin+randomDecimal;
		
		System.out.println("Your encrypted pin number is " + encryptedPin);
		
		scan.close();
	}
}
