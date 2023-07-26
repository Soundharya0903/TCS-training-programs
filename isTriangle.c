#include<stdio.h>
int isTriangle(long long n,long long m,long long k)
{
long long T=(n*m)/k;
if(T<=0 || (n*m)%k!=0)
{
return 0;
}
printf("yes");
return 1;
}
int main()
{
long long n,m,k;
scanf("%lld %lld %lld",&n,&m,&k);
if(!isTriangle(,m,k))
{
printf("no");
}
return0;
}