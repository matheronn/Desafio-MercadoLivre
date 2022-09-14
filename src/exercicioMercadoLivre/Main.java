package exercicioMercadoLivre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("MaxDigit");
		int num = sc.nextInt();
		int maxDigit = num * 1111;

		for (int minDigit = 1000; minDigit <= maxDigit; minDigit++) {
			String number = String.valueOf(minDigit);
			char[] digits = number.toCharArray();

			int value0 = Integer.parseInt(String.valueOf(digits[0]));
			int value1 = Integer.parseInt(String.valueOf(digits[1]));
			int value2 = Integer.parseInt(String.valueOf(digits[2]));
			int value3 = Integer.parseInt(String.valueOf(digits[3]));
			
			if(value0 <= num && value1 <= num && value2 <= num && value3 <= num) {
				int sum = value0 + value1 + value2 + value3;
				if (sum == 21) {
					System.out.println(minDigit);
				}
			}
		}
	}
}
