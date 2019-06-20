#include <stdio.h>
int factorial(int x);
int main() 
{
	int num,i,fact=0,num_copy;
  scanf("%d",&num);
  num_copy=num;
  for(i=0; num>0; ++i)
  {
    fact= fact + factorial(num%10);
    num=num/10;
  }
  if(fact == num_copy)
    printf("Yes");
  else
    printf("No");
	return 0;
}
int factorial(int x)
{
  int i,fact_in=1;
  for(i=1; i<=x; ++i)
  {
    fact_in *= i;
  }
  return fact_in;
}