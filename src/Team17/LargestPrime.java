package Team17;

public class LargestPrime {
	LargestPrime(){};
	static int largestPrime(int []arr) {
		int largest_prime=-1;
		for(int i=0;i<arr.length;i++) {
			boolean isPrime=true;
			for(int j=2;j<=arr[i]/2;j++) {
				if(arr[i]%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime && arr[i]>largest_prime&&arr[i]!=0&&arr[i]!=1) {
				largest_prime=arr[i];
			}
		}
		return largest_prime;
	}
}
