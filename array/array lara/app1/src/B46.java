 //develop third array with every elements of given two array.
 //note: consider both array element one by one.
 /*
 
example
 first arrays content : {3,7,15,9,1,12,5};
 second array content : {45,50,60,55}
 third array  : {3,45,7,50,15,60,9,55,1,12,5};
*/
import java.util.Arrays;
class  B46
{
	public static void main(String[] args) 
	{
		 
		int[] x = {3,7,15,9,1,12,5};
		int[] y = {45,50,60,55};
		System.out.println(" initial second array constant:" + Arrays.toString(x));
		System.out.println(" initial second array constant:" + Arrays.toString(y));

		int size = x.length + y.length ;
		int[] z = new int[size];
		 for(int i = x.length - 1, j = y.length - 1, k = z.length -1; (i >= 0 || j >= 0); i--, j--)
		{
			 if(i >= 0)
			{
				 z[k--] = x[i];
			}
			if(j >= 0)
			{
				z[k--] = y[j];
			}
			  
		}
			 
	 
		System.out.println(" third array constant:" + Arrays.toString(z));
	    }
}


