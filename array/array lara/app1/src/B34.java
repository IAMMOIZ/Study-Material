
//insert 2 new element from index number 4. new element are 100,40;
/*
example
initial array constant : (1,2,3,5,6,3,9,7,2,9,8);
finial array constant  : (1,2,3,5,100,40,9,7,2,9,8);


*/
import java.util.Arrays;
class B34
{
	public static void main(String[] args) 
	{
		int[] x ={1,2,3,5,6,3,9,7,2,9,8};
		//        0,1,2,3,4,5,6,7,8,9,10
	 
		System.out.println(" initial array constant:" + Arrays.toString(x));
		int[] y = new int[x.length+2];
		for(int i = 0; i < x.length;i++)
		{
			y[i] = x[i];
		}
		for(int i = y.length-1; i >4; i--)
		{
			y[i] = y[i-2];
		}
		y[4] = 100;
		y[5] = 40;
		  

	 
		System.out.println(" final array constant:" + Arrays.toString(x));
		
	}
}