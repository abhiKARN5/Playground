#include<stdio.h>
int main()
{
int num,sum,dig1,dig2;
  scanf("%d",&num);
  dig1=num/10;
  dig2=num%10;
  sum=dig1+dig2;
  printf("%d",sum);
  return 0;
}