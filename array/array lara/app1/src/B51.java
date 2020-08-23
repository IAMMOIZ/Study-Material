 //remove all even indexed elements.
 
 /*
 
example
 first arrays content : {3,7,15,9,1,12, 5,66,4,29,80};
                         0 1  2 3 4  5  6 7  8  9 10
 final array          : {7,9,12,66,29};
*/
import java.util.Arrays;
class  B51
{
	public static void main(String[] args) 
	{
		 
		int[] x = {3,7,15,9,1,12,5,66,4,29,80};
		 int min = x[0];
		 for(int i = 1; i < x.length; i++)
		{
			 if(x[i]< min)
			{
				 min = x[i];
			}
		}
		 for(int i = 0; i < x.length; i+=2)
		{
			 x[i] = (min - 1);
		}
		int count = 0;
         for(int i = 0; i< x.length -count ;i++)
		{
			 if(x[i] == (min - 1))
			{
				 for(int j  = i; j < x.length - count -1; j++)
				{
					 x[j] = x[j+1];
				}
				i--;
				count ++;
			}
		}
		int [] y = new int[x.length - count];
		for(int i = 0; i < y.length; i++)
		{
			y[i] = x[i];
		}
		System.out.println(" final array constant:" + Arrays.toString(y));
	    }
}


