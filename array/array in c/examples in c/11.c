//get array size and array element from the user 
// short array in acsending order
#include<stdio.h>
int main()
{
	int size,temp,i,flag,lookfor;
	printf("Enter size of array : ");
	scanf("%d",&size);
	int arr[size],index;
	for(index=0;index<size;index++)
	{
		printf("enter an element : ");
		scanf("%d",&arr[index]);
	}
	//get element for searching 
	printf("_________________________\nenter a element for search  : ");
	scanf("%d",&lookfor);
	//searching
	flag=0;
	for(i=0;i<size;i++)
	{
		if(arr[i]==lookfor)
	{
		flag=1;
		break;
	}
	}
	//print array
	if(flag==1)
		printf("element found");
	else
		printf("not found");
	}