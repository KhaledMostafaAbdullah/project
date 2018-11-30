package Team17;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleCLASS {
	 public  void shuffleArray (int ar[],char b[])
	  {
	    
		  Random rnd = ThreadLocalRandom.current();
		    for (int i = ar.length - 1; i > 0; i--)
		    {
		      int index = rnd.nextInt(i + 1);
		      // Simple swap
		      int a = ar[index];
		      ar[index] = ar[i];
		      ar[i] = a;
		    }
		  
	    System.out.println("The Shuffle  integers Array is :"+Arrays.toString(ar));
		
	    Random r = ThreadLocalRandom.current();
	    for (int i = b.length - 1; i > 0; i--)
	    {
	      int  index = r.nextInt(i + 1);
	      char y= b[index];
	      b[index] = b[i];
	      b[i] = y;
	    }
	    
	    System.out.println("The Shuffle  Characters Array is :"+Arrays.toString(b));
		
	  
	  
	  }

}