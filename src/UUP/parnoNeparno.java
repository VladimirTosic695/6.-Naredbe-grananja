package UUP;

import java.util.Scanner;

public class parnoNeparno {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost za a: ");
		int a = input.nextInt();
		System.out.print("Unesite vrednost za b: ");
		int b = input.nextInt();
		int z;

		if (a % 2 != 0 && b % 2 == 0)

			z = a + b;
		else
			z = a * b;
		System.out.println("z je " + z);
		input.close();

	}

}
