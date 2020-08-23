//get array size and array element from the user 
// find the second small element of array
#include<stdio.h>
int secondlarge(int* , int );
int main()
{
	int size;
	printf("Enter size of array : ");
	scanf("%d",&size);
	int arr[size],index;
	for(index=0;index<size;index++)
	{
		printf("enter an element : ");
		scanf("%d",&arr[index]);
	}
	printf("second small element of array : %d ",secondsmall(arr,size));
}
int secondsmall(int *arr, int size)
{
	int small=arr[0],ssmall=arr[0],index;
	for(index=1;index<size;index++)
	{
		if(arr[index]<small)
			small=arr[index];
	}
	for(index=1;index<size;index++)
	{
		if(arr[index]<ssmall && arr[index]>small)
			ssmall=arr[index];
	}
	return ssmall;	
}