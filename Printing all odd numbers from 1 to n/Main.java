#include <stdio.h>
int main() 
{
	int num,i;
  scanf("%d",&num);
  for(i=0; i<=num; i++)
  {
    if(i%2 != 0)
      printf("%d\n",i);
    else 
      continue;
  }
	return 0;
}