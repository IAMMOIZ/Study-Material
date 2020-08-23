//find out max value from an int array
import java.util.Arrays;
class B15
{
	public static void main(String[] args) 
	{
		int[] x ={12,30,500,55,5,35,50,2,0,34};
		System.out.println("array constant:" + Arrays.toString(x));
         
		 int max = x[0];
		 for(int i = 1; i < x.length; i++)
		{
			 if(x[i]> max)
			{
				 max = x[i];
			}
		}

		System.out.println("min value:"+ max);
	}
}
        