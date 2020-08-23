//get array size and array element from the user 
// array  is pallindrom or not .
#include<stdio.h>
int main()
{
	int size,flag=0,index2;
	printf("Enter size of array : ");
	scanf("%d",&size);
	int arr[size],index;
	for(index=0;index<size;index++)
	{
		printf("enter an element : ");
		scanf("%d",&arr[index]);
	}
	//pallindrom chacking
	for(index=0,index2=size-1;index<index2;index++,index2--)
	{
		if(arr[index]!=arr[index2])
		{
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
		printf("array is pallindrome");
	}
	else
	{
		printf("array is not pallindrom");
	}
	return 0;
}