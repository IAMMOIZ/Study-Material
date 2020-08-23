
//swap first element with last element;
import java.util.Arrays;
class B21
{
	public static void main(String[] args) 
	{
		int[] x ={1,2,3,5,6,3,9,7,2,9,8};
		//        0,1,2,3,4,5,6,7,8,9,10
		//output should be  2,3,6,9
		System.out.println("array constant:" + Arrays.toString(x));
		 x[0] = x[0] + x[x.length - 1];
		 x[x.length-1] = x[0] - x[x.length-1];
		x[0] =x[0]- x[x.length - 1];
		
		System.out.println(" final array constant:" + Arrays.toString(x));
	}

}
        