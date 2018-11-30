package Team17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;

public class Main {
	private static Scanner input;

	private static void print_messages() {
		System.out.println("<<<Main Menu>>>");
		System.out.println("1-Most repeated value\t2-Sort\t3-Shuffle\t4-Find the largest prime\t5-Find the smallest prime\t6-Check palindrome");
		System.out.println("7-Check sorted\t8-Count Primes-\t9-Reverse array\t10-Shift array\t11-Distinct array\t12-Get the maximum 3 numbers");
		System.out.println("13-Get the minimum 3 numbers\t14-Get average\t15-Get median\t16-Return only primes\t17-Zero if less than zero\t18-to execute all");
		System.out.println("press 0('zero') to exit");
		System.out.println("Enter the number of which function to be executed:");
	}

	public static void main(String[] args) {


		System.out.println("Enter the size of array:");

		input = new Scanner(System.in);
		int size = input.nextInt();// this wil be used for both integers and chars array

		int[] int_arr = new int[size]; char[] char_arr = new char[size]; //declaration of both int and char array

		System.out.println("Fill the array of Type INTEGERS:"); //filling the int array
		for (int i = 0; i < int_arr.length; ++i) {
			int_arr[i] = input.nextInt();
		}

		System.out.println("Please Fill Characters Array"); //filling the char array
		for (int i = 0; i < char_arr.length; ++i)
			char_arr[i] = input.next().charAt(0);


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


	private static void switch_runner(int choice) {
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
				//please call both the integer and char array
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
				//please call both the integer and char array
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

