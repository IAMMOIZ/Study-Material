
//find out avg of all int values from an int array
import java.util.Arrays;
class B17
{
	public static void main(String[] args) 
	{
		int[] x ={12,30,500,55,5,35,50,2,0,34};
		System.out.println("array constant:" + Arrays.toString(x));
         
		 int sum = 0;
		 for(int i = 0; i < x.length; i++)
			{
				 sum += x[i];
			}
			double avg = (double) sum/ x.length;


		System.out.println("sum:"+ avg);
	}
}
        