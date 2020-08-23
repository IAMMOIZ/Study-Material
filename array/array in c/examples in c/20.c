//get array size and array element from the user 
//left rotation of array element 
#include<stdio.h>
int main()
{
	int size,index,temp;
	printf("Enter size of  array : ");
	scanf("%d",&size);
	int arr[size];
	printf("enter array elements_________\n");
	for(index=0;index<size;index++)
	{
		printf("enter an element : ");
		scanf("%d",&arr[index]);
	}
	//keep first element seprate
	temp=arr[0];
	//logic of left sifting
	for(index=1;index<size;index++)
	{
		arr[index-1]=arr[index];
	}
	//assign first element to last position
	arr[size-1]=temp;
	//print array 
	for(index=0;index<size;index++)
	{
		printf("%d\t",arr[index]);
	}
	


	return 0;
	}

