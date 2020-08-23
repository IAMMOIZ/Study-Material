 //find out all missed number from a given int array b/w min and max value.
 /*
 
example
initial array content :
given array : {3,7,15,9,1,12,5}
missed array content :  {2,4,6,8,10,11,13,14}
 
*/
import java.util.Arrays;
class  B43
{
	public static void main(String[] args) 
	{
		int[] x ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		//        0,1,2,3,4,5,6,7,
		int[] y = {3,7,15,9,1,12,5};
		 
	 int size = x.length + y.length ;
		int[] z = new int[size];
		 int count = 0;
		 boolean isAvailable = false;
		 for(int i = 0; i < x.length ; i++)
		{
			 for(int j = 0 ; j < y.length ; j++)
			{
				if(x[i] == y[j])
				{
					 isAvailable = true;
					 break;
				}
			}
					 
			if(!isAvailable)
					{
			     	z[count++] = x[i];
					}
			    	 isAvailable = false;
				    }

			for(int i = 0; i < y.length ; i++)
		    {
			 for(int j = 0 ; j < x.length ; j++)
			  {
				if(y[i] == x[j])
				{
					isAvailable = true;
					break;
				}
			}
					 
			if(!isAvailable)
					{
			     	z[count++] = y[i];
					}
			    	 isAvailable = false;
				    }
		int[] z1 = new int[count];
		for(int i = 0; i < z1.length; i++)
		{
			z1[i] = z[i];
		}
		System.out.println(" third array constant:" + Arrays.toString(z1));
	    }
}


