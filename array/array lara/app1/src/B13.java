//find out min value from an int array
import java.util.Arrays;
class B13
{
	public static void main(String[] args) 
	{
		int[] x ={12,30,500,55,5,35,50,2,0,34};
		System.out.println("array constant:" + Arrays.toString(x));
         
		 int min = x[0];
		 for(int i = 1; i < x.length; i++)
		{
			 if(x[i]< min)
			{
				 min = x[i];
			}
		}

		System.out.println("min value:"+ min);
	}
}
        