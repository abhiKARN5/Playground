#include <stdio.h>
int main() 
{
	int num;
  scanf("%d",&num);
  while(num>=100)
    num=num/10;
  num=num%10;
  printf("%d",num);
	return 0;
}