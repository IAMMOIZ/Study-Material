//get all element of array from the user with size
//add new element at last index
//we increase only size of array by one and going to insert new element at last index
#include<stdio.h>
int main()
{
	int size;
	printf("Enter size of array : ");
	scanf("%d",&size);
	int arr[size],newEle,index;
	for(index=0;index<size;index++)
	{
		printf("Enter element of array : ");
		scanf("%d",&arr[index]);
	}
	printf("-----------------\n");
	printf("Enter new element : ");
	scanf("%d",&newEle);
	//element ko last index p assign kro or array ka size increase kro by one
	arr[size]=newEle;
	size++;
	//print whole array
	printf("------------------------\nnew array is \n");
	for(index=0;index<size;index++)
	{
		printf("%d\t",arr[index]);
	}
	return 0;
}