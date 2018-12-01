package Team17;

import java.util.Arrays;
import java.util.Scanner;

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
		String s=input.nextLine();s=input.nextLine();
		char_arr=s.toCharArray(); 


		print_messages();
		int choice = input.nextInt();

		while (choice > 0) {
			if (choice == 18) {//this will loop on all functions from 1 to 17
				for (int i = 1; i < 18; i++) {
					switch_runner(i,int_arr,char_arr);
				}
			} else {
				switch_runner(choice,int_arr,char_arr);
			}

			print_messages();
			choice = input.nextInt();
		}

	}


	private static void switch_runner(int choice,int [] int_arr,char [] char_arr) {

		switch (choice)   //Add your functions
		{
			case 1:
				MostRepeated m=new MostRepeated();
			        m. most_repeated( int_arr, int_arr.length);
				break;
			case 2:
				//Sort
				//please try not to exceed two when calling your class
				break;
			case 3:
				ShuffleCLASS Obj=new ShuffleCLASS();
				Obj.shuffleArray (int_arr,char_arr);
				break;
			case 4:
				//Find the largest prime
				System.out.println("Largest Prime is "+LargestPrime.largestPrime(int_arr));
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
				Checksorted ob7 = new Checksorted();
				boolean checked = ob7.checksorted(int_arr);
				if (checked) {
					System.out.println("your Array sorted");
				} else {
					System.out.println("your Array not sorted");
				}
				break;
			case 8:
			{
				CountPrimes obj=new CountPrimes();
				System.out.println("Number of Primes are:"+obj.Count_Primes(int_arr));
			}
				break;
			case 9:
				revers_arr x=new revers_arr();
				x.eversint(int_arr);
				x.reverschar(char_arr);
				
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
				get_the_max3num new_obj = new get_the_max3num();
				new_obj.max_3_num(int_arr);
				break;
			case 13:
				//Get the minimum 3 numbers
				//please try not to exceed two when calling your class
				break;
			case 14:
				{
				GetAvg avg =new GetAvg();
                                avg.Get_average(int_arr);
                                }
				break;
			case 15:
				getMedian x=new getMedian();
				x.getMedian(int_arr);
				break;
			case 16:
				//Return only primes
				//please try not to exceed two when calling your class
				break;
			case 17:
				System.out.println("The Input array to change negative integers to zero : " + Arrays.toString(int_arr));
				System.out.println("The output array of the prev input : " + Arrays.toString(new NegativeToZero().negativetozero(int_arr)));
				break;
			default:
				System.out.println("Invalid input!");
				break;
		}
	}
}

