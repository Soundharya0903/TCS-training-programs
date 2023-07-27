#include<stdio.h>
int count(int n,int i,int x)
{
    int w[n+1];
    w[i]=1;
    w[i-1]=1;
    for(int k=i+1;k<=n;k++)
    {
        w[k]=0;
        for(int j=1;j<=x && k-j>=i;j++)
        {
            w[k]+=w[k-j];
        }
    }
    return w[n];
}
int main()
{
    int i,n,x;
    scanf("%d",&i);
    scanf("%d",&n);
    scanf("%d",&x);
    int num=count(n,i,x);
    printf("%d",num);
    return 0;
}