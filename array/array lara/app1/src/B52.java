//bubble sort
/*
example
initial arrays content : {3,7,15,9,1,10,7,99,4,15,12}
final arrays content   : {1,3,4,7,7,9,10,12,15,15,66}
*/ 
import java.util.Arrays;
class  B52
{
	public static void main(String[] args) 
	{
		int[] x ={3,7,15,9,1,10,7,66,4,15,12};
		System.out.println(Arrays.toString(x));
		for(int i = 0; i < x.length; i++)
		{
			for(int j = 0 ; j < x.length - 1; j++)
		   {
				if(x[j] > x[j+1])
			{
					int temp = x[j];
					x[j]= x[j+1];
					x[j+1] = temp;
			}
		}
		}
		System.out.println(Arrays.toString(x));

	}
}
/*
{3,7,15,9,1,10,7,66,4,15,12}
 0  1 2 3 4  5 6  7 8  9 10

int i = 0;
-----------
     int j = 0;
	 ----------
	 {3,7,15,9,1,10,7,66,4,15,12}
      0  1 2 3 4  5 6  7 8  9 10

	 int j = 1;
	 ---------- 
	 {3,7,15,9,1,10,7,66,4,15,12}
      0  1 2 3 4  5 6  7 8  9 10

	 int j = 2;
	 ----------
	 {3,7,9,15,1,10,7,66,4,15,12}
      0 1 2  3 4  5 6  7 8  9 10

	   int j = 3;
	 ----------
	 {3,7,9,1,15,10,7,66,4,15,12}
      0 1 2 3  4  5 6  7 8  9 10

     int j = 4;
	 ----------
	 {3,7,9,1,10,15,7,66,4,15,12}
      0 1 2 3  4  5 6  7 8  9 10
	    
     int j = 5;
	 ----------
	 {3,7,9,1,10,7,15,66,4,15,12}
      0 1 2 3  4 5  6  7 8  9 10

	   int j = 6;
	 ----------
	 {3,7,9,1,10,7,15,66,4,15,12}
      0 1 2 3  4 5  6  7 8  9 10

	   int j = 7;
	 ----------
	 {3,7,9,1,10,7,15,4,66,15,12}
      0 1 2 3  4 5  6 7  8  9 10

       int j = 8;
	   ----------
	 {3,7,9,1,10,7,15,4,15,66,12}
      0 1 2 3  4 5  6 7  8  9 10

       int j = 9;
	   ----------
	 {3,7,9,1,10,7,15,4,15,12,66}
      0 1 2 3  4 5  6 7  8  9 10
	   



int i = 1;
---------------------- 
 
          int j = 0; 
		  ----------------
	       {3,7,9,1,10,7,15,4,15,12,66}
            0 1 2 3  4 5  6 7  8  9 10
	    
		   int j = 1; 
		  ----------------
	       {3,7,9,1,10,7,15,4,15,12,66}
            0 1 2 3  4 5  6 7  8  9 10
	   

          int j = 2; 
		  ----------------
	       {3,7,9,1,10,7,15,4,15,12,66}
            0 1 2 3  4 5  6 7  8  9 10
	   
	     int j = 3; 
		  ----------------
	       {3,7,1,9,10,7,15,4,15,12,66}
            0 1 2 3  4 5  6 7  8  9 10
	   

            int j = 4; 
		  ----------------
	       {3,7,1,9,10,7,15,4,15,12,66}
            0 1 2 3  4 5  6 7  8  9 10
	   

           int j = 5; 
		  ----------------
	       {3,7,1,9,7,10,15,4,15,12,66}
            0 1 2 3 4  5  6 7  8  9 10
	   

           int j = 6; 
		  ----------------
	       {3,7,1,9,7,10,15,4,15,12,66}
            0 1 2 3 4  5  6 7  8  9 10
	   

           int j = 7; 
		  ----------------
	       {3,7,1,9,7,10,4,15,15,12,66}
            0 1 2 3 4  5 6  7  8  9 10
	   
          int j = 8; 
		  ----------------
	       {3,7,1,9,7,10,4,15,12,15,66}
            0 1 2 3 4  5 6  7  8  9 10
	   

   
          int j = 9; 
		  ----------------
	       {3,7,1,9,7,10,4,15,12,15,66}
            0 1 2 3 4  5 6  7  8  9 10
	   


