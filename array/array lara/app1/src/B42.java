 //find out all missed number from a given int array b/w min and max value.
 /*
 
example
initial array content :
given array : {3,7,15,9,1,12,5}
missed array content :  {2,4,6,8,10,11,13,14}
 
*/
import java.util.Arrays;
class  B42
{
	public static void main(String[] args) 
	{
		 
		int[] x = {3,7,15,9,1,12,5};

		int min = x[0],max = x[0];
	 
		 for(int i = 1; i < x.length ; i++)
		{
			 if(x[i] < min)
				{ 
					min = x[i];
				} 
				if(x[i] > max)
				{ 
					max = x[i];
				}
			}
			int[] y = new int[max+1];
			int replace = (min - 1) == 0 ?(min - 2) : (min - 1);
			for(int i = 0; i < x.length; i++)
		{
				y[x[i]] = min -5;
		}
		System.out.println("missed elements:");
		for(int i = min +1 ; i < y.length; i++)
		{
			if(y[i] != (min -5))
			{
				System.out.print(i+ ",");
			}
		}
	}
					 
			 
		 
}


