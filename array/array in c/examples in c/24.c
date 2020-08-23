//this logic is applicable for inserting only one element in array 
//get array and array size from the user
//get new element and also get a index of element 
#include<stdio.h>
int main()
{
	int size;
	printf("Enter size of array : ");
	scanf("%d",&size);
	int arr[size],newEle,index,index1;
	for(index=0;index<size;index++)
	{
		printf("Enter element of array : ");
		scanf("%d",&arr[index]);
	}
	//get new element and index of new element 
	printf("-----------------\n");
	printf("Enter new element : ");
	scanf("%d",&newEle);
	printf("Enter index of new element : ");
	scanf("%d",&index1);
	//logic of inserting new element at specific index
	//in inserting new element we always going to use right shift algorithm	
	for(index=size;index>index1;index--)
	{
		arr[index]=arr[index-1];
	}//it is logic of right shifting 
	
	size++;//first increase the size of array by one

	arr[index1]=newEle;//assign new element at specified index

	//printing array
	for(index=0;index<size;index++)
	{
		printf("%d\t",arr[index]);
	}
	
	
}
