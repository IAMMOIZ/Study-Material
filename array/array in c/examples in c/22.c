//get array size and array element from the user 
//right rotation of array element 
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
	//keep last element  secure 
	temp=arr[size-1];
	//logic of right shifting
	for(index=size-2;index>=0;index--)
	{
		//next ko pre. ki value assign krna h
		arr[index+1]=arr[index];
	}
	//last element aassign to first position
	arr[0]=temp;
	//print array 
	for(index=0;index<size;index++)
	{
		printf("%d\t",arr[index]);
	}
	return 0;
	}

