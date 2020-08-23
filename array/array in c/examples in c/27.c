//get array size and element from user
//delete last element of array
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
	//only size decrease by one
	size--;
	printf("------------------------\nnew array is \n");
	for(index=0;index<size;index++)
	{
		printf("%d\t",arr[index]);
	}
	return 0;
}