package Team17;

public class CountPrimes {
	public int Count_Primes(int []arr)
	{
		int counter=0;
		for(int i=0;i<arr.length;++i){
			for(int y=2;y<=arr[i];++y)
			{		
				if(arr[i]%y==0&&arr[i]!=2)   
					break;
				if((arr[i]%y!=0&&y+1==arr[i])||arr[i]==2)
					counter++;}}
		return counter;
	}

}
