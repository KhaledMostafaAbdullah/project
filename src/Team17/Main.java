package Team17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

public class Main {
	private static Scanner input;
	public static void main(String[]args) {


		input = new Scanner(System.in);
		System.out.println("Press 1 to input numbers and 2 for characters");
		int typeOfArray = input.nextInt();
		input = new Scanner(System.in); // if i don't re declare it raises some run time error
		System.out.println("Please Input the Array");
		String array = input.nextLine();    // get the entire line after the prompt

		if (typeOfArray == 1) {
			String[] numbers = array.replace(" ", "").split(",");
			int[] a = new int[numbers.length];
			for (int i = 0; i < numbers.length; i++) {
				System.out.println(numbers[i]);
				a[i] = Integer.parseInt(numbers[i]);
			}
		} else {
			char[] char_array = array.toCharArray(); //i haven't test this well
		}

		print_messages();
		int choice = input.nextInt();

		while (choice > 0) {
			if (choice == 18) {//this will loop on all functions from 1 to 17
				for (int i = 1; i < 18; i++) {
					switch_runner(i);
				}
			} else {
				System.out.println("hekko");
				switch_runner(choice);
			}
			print_messages();
			 choice = input.nextInt();
		}
		
	}

	private static void print_messages(){
		System.out.println("<<<Main Menu>>>");
		System.out.println("1-Most repeated value\t2-Sort\t3-Shuffle\t4-Find the largest prime\t5-Find the smallest prime\t6-Check palindrome");
		System.out.println("7-Check sorted\t8-Count Primes-\t9-Reverse array\t10-Shift array\t11-Distinct array\t12-Get the maximum 3 numbers");
		System.out.println("13-Get the minimum 3 numbers\t14-Get average\t15-Get median\t16-Return only primes\t17-Zero if less than zero\t18-to execute all");
		System.out.println("press 0('zero') to exit");
		System.out.println("Enter the number of which function to be executed:");
	}
	private static void switch_runner(int choice){
		switch (choice)   //Add your functions
		{
			case 1:
				//Most repeated value
				//please try not to exceed two when calling your class
				break;
			case 2:
				//Sort
				//please try not to exceed two when calling your class
				break;
			case 3:
				//Shuffle
				//please try not to exceed two when calling your class
				break;
			case 4:
				//Find the largest prime
				//please try not to exceed two when calling your class
				break;
			case 5:
				//Find the smallest prime
				//please try not to exceed two when calling your class
				break;
			case 6:
				//Check palindrome
				//please try not to exceed two when calling your class
				break;
			case 7:
				//Check sorted
				//please try not to exceed two when calling your class
				break;
			case 8:
				// count prime
				//please try not to exceed two when calling your class
				break;
			case 9:
				//Reverse array
				//please try not to exceed two when calling your class
				break;
			case 10:
				//Shift array
				//please try not to exceed two when calling your class
				break;
			case 11:
				//Distinct array
				//please try not to exceed two when calling your class
				break;
			case 12:
				//Get the maximum 3 numbers
				//please try not to exceed two when calling your class
				break;
			case 13:
				//Get the minimum 3 numbers
				//please try not to exceed two when calling your class
				break;
			case 14:
				//Get average
				//please try not to exceed two when calling your class
				break;
			case 15:
				//Get median
				//please try not to exceed two when calling your class
				break;
			case 16:
				//Return only primes
				//please try not to exceed two when calling your class
				break;
			case 17:
				//Zero if less than zero
				//please try not to exceed two when calling your class
				break;
			default:
				System.out.println("Invalid input!");
				break;
		}
	}
}

