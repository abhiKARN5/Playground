#include <stdio.h>
#include<math.h>
int main() 
{
	int num,i,temp;
  scanf("%d",&num);
  temp=num;
  int count=0;
  while(temp>0)
  {
    temp = temp/10;
    ++count;
  }
  temp=0;
  int num_copy;
  num_copy=num;
  for(i=0; i<count; ++i)
  {
    temp = temp + pow((num%10),count);
    num = num/10;
  }
  if(temp == num_copy)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}