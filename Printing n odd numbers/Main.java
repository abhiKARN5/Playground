#include <stdio.h>
int main() 
{
  int i, num;
  scanf("%d",&num);
  for( i=0; i<num; i++)
  {
    int value;
    value= (2*i) + 1;
    printf("%d\n",value);
  }
	return 0;
}