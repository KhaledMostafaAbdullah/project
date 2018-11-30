package Team17;

public class GetAvg 
{
	public static void Get_average (int [] arr)
	{
		int counter = 0 ;
		float avg ;
		int sum =0;
		for (int i =0 ; i <arr.length ; i++ )
		{
			sum += arr[i];
			counter++;
		}
		avg = sum / counter;

		System.out.println("average ="+ avg);
	}
}