//get array size and array element from the user 
// search a element and print found or not and also print the occurence
#include<stdio.h>
int main()
{
	int size,temp,i,flag,lookfor,j;
	printf("Enter size of array : ");
	scanf("%d",&size);
	int arr[size],index,counter=0;
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
		for(j=i;j<size;j++)
		{
			if(arr[j]==lookfor)
			{
				counter++;
			}
		}
		break;
	}
	}

	//print array
	if(flag==1)
		printf("element found %d times",counter);
	else
		printf("not found");


}