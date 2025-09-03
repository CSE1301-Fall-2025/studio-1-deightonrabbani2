package studio1;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("The first of two integers to be averaged?");
		System.out.println("Value for x?");
		int n1 = in.nextInt();
		System.out.println("Value for y?");
		int n2 = in.nextInt();
		

        System.out.println(((n1+n2)/2.0));

    }
}