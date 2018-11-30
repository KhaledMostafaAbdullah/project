package Team17;

public class MostRepeated {
	
	static void most_repeated(int arr[], int n) {
	
	int counter =0, ans=0, sum=1;
	  for(int i=0; i<n; i++){
	    counter=0;
	    for(int j=0; j<n; j++){
	        if(arr[j]==i)counter++;
	    }
	    if(counter>sum){sum=counter;ans=i;}
	  }
	  if(ans==0)System.out.println("all values equal \n");
	  else System.out.println("then the most repeated value is : "+ans);
	  }


}




