#include<stdio.h>
int main()
{
  int dig2l,num;
  scanf("%d",&num);
  dig2l=(num%100)/10;
  printf("%d",dig2l);
  return 0;
}