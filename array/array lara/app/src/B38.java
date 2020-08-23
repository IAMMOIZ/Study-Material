
//remone duplicate from the  int array;
/*
example
initial array constant : (1,20,3,1,61,3,19,7,61,9,80);
finial array constant  : (20,19,80);


*/
import java.util.Arrays;
class B38
{
	public static void main(String[] args) 
	{
		int[] x ={1,20,3,1,61,3,19,7,61,9,80};
		//        0,1,2,3,4,5,6,7,8,9,10
	 
		System.out.println(" initial array constant:" + Arrays.toString(x));
		 int count = 0;
		 for(int i= 0; i < x.length; i++)
		{
			

		  int[] y = new  int[x.length  - count];
		  for(int j = 0; i < x.length; j++)
		{
			  if(x[i] == y[i])
			{
			  y[j++] = x[i];
			}
		}
		}
	 
		System.out.println(" final array constant:" + Arrays.toString(y));
		
	}
}