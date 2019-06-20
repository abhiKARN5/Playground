#include<stdio.h>
int main()
{
  int num,dig1,dig3,sum=0;
  scanf("%d",&num);
  dig1=(num/100);
  dig3=(num%100)%10;
  sum=dig1+dig3;
  printf("%d",sum);
  return 0;
}