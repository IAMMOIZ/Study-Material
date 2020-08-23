//get array element from the user 
#include<stdio.h>
int main()
{
	int a[10],index;
	for(index=0;index<10;index++)
	{
		printf("enter an element : ");
		scanf("%d",&a[index]);
	}
	for(index=0;index<10;index++)
	{
		printf("a[%d] : %d \n",index,a[index]);
	}
	
	
}