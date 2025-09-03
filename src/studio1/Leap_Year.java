package studio1;

import java.util.Scanner;

public class Leap_Year {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Year:");
		System.out.println("Value for x?");
		int year = in.nextInt();

        boolean isLeapYear = false;
		isLeapYear = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
		System.out.println(isLeapYear);

    }
}
