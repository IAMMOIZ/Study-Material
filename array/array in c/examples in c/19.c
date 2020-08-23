//get array size and array element from the user 
//left shift of array element 
#include<stdio.h>
int main()
{
	int size,index;
	printf("Enter size of  array : ");
	scanf("%d",&size);
	int arr[size];
	printf("enter array elements_________\n");
	for(index=0;index<size;index++)
	{
		printf("enter an element : ");
		scanf("%d",&arr[index]);
	}
	//logic of left sifting
	for(index=1;index<size;index++)
	{
		//previous ko next ki velue assign kro
		arr[index-1]=arr[index];
	}
	//print array 
	for(index=0;index<size;index++)
	{
		printf("%d\t",arr[index]);
	}
	


	return 0;
	}

