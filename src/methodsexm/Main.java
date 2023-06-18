package methodsexm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number :");
        double num= scanner.nextDouble();
		
		
		if (num < 10) {
			findnumber();
		}
		else {
			finddnumber(num);
		}
	}

	public static void findnumber() {

		System.out.println("omar");

	}
	public static void finddnumber(double ss) {

		System.out.println("can "+ss);

	}
}
