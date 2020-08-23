 //remove range of element  from a given array.
 
 /*
 
example
 first arrays content : {3,7,15,9,1,12,5,66,4,29,80};
                          0 1 2 3 4  5 6  7 8  9  10
remove from index 3 to 7.(both index are inclusive)
 final array          : {3,7,15,4,29,80};
*/
import java.util.Arrays;
class  B50
{
	public static void main(String[] args) 
	{
		 
		int[] x = {3,7,15,9,1,12,5,66,4,29,80};
		int from = 3, to = 7, temp;
		int shift = to -from + 1 ;
            for(int i = from; i< x.length -shift ;i++)
		{
			temp = x[i];
			x[i] = x[i+shift];
			x[i + shift] = temp;
		}
		int [] y = new int[x.length - shift];
		for(int i = 0; i < y.length; i++)
		{
			y[i] = x[i];
		}

	
	 
		System.out.println(" final array constant:" + Arrays.toString(x));
		System.out.println(" final array constant:" + Arrays.toString(y));
	    }
}


