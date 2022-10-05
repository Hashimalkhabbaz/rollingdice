//this prgram will ask you what is your name and give you a random number from 1 to 6 when you hit enter 

package rolladice;

import java.util.Random;
import java.util.Scanner;

public class rollingdice {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("please enter your name");
		String name = input.nextLine();
		Random num = new Random();
		int x = num.nextInt(6)+1;
		System.out.println("Hello "+name+"your number is "+ x);
	}

}
