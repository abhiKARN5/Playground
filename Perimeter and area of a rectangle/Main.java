#include<stdio.h>
int main()
{
int length=6,breadth=9,area=0,perimeter=0;
  area=length*breadth;
  perimeter=2*(length+breadth);
  printf("The perimeter of the rectangle is: %d cm",perimeter);
  printf("\nThe area of the rectangle is: %d sq cm",area);
  return 0;
}