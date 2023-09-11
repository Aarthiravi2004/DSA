#include<stdio.h>
#include<stdlib.h>
#include<limits.h>

int main()
{
   int n,x,y;
   scanf("%d%d%d",&n,&x,&y);
   int min = INT_MAX;
   for(int i=n/2;i>=0;i--)
   {
       int k=(i*y+(n-(i*2))*x);
       if(k<min)
       {
           min=k;
       }
   }
   printf("%d",min);
}
