
//print only valued which are less then avg value.
import java.util.Arrays;
class B18
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


		System.out.println("lessre then avg value:");
		for(int i= 0; i < x.length; i++)
		{
			if(x[i] < avg)
			{
				
	     	System.out.print(x[i] +",");
			}

	}
}
}
        