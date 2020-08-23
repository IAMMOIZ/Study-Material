//get array size and array element from the user . find the sum of element of array
#include<stdio.h>
int sum(int* , int );
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
	printf("Sum of array : %d ",sum(arr,size));
}
int sum(int *arr, int size)
{
	int sum,index;
	sum=0;
	for(index=0;index<size;index++)
	{
		sum = sum+arr[index];
	}
	return sum;	
}