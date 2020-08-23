 //swap even indexed element with immediate odd indexed elements .
 
 /*
 
example
 first arrays content : {3,7,15,9,1,12,5,66,4,29,80};
 final array          : {7,3,9,15,12,1,66,5,29,4,80};
*/
import java.util.Arrays;
class  B49
{
	public static void main(String[] args) 
	{
		 
		int[] x = {3,7,15,9,1,12,5,66,4,29,80};
		System.out.println(" initial second array constant:" + Arrays.toString(x));
               int temp;
			 for(int i = 0; i < x.length - 1; i += 2)
		{
			  temp = x[i];
			 x[i] = x[i+1];
			 x[i+1] = temp;
		}
	
	 
		System.out.println(" final array constant:" + Arrays.toString(x));
	    }
}


