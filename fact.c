#include<stdio.h>
int fact(int n);
int main()
{
    int n,i,m,rem=0;
    scanf("%d",&n);
    m=fact(n);
    rem=m%10;
    
    if(rem==0)
    {
        while(m%10==0){
            m=m/10;   
        }
        printf("%d",m%10);
    }
    else{
        printf("%d",rem);
    }
    
}
int fact(int n)
{
    if(n==0 || n==1)
    {
        return 1;
    }
    else
    {
        return n*fact(n-1);
    }
}
