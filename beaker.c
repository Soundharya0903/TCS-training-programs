#include<stdio.h>
int gcd(int a, int b);
int canGetSoln(int x, int y,int z)
{
    int sum=x+y;
    if(z<=sum && z%gcd(x,y)==0)
    {
        printf("YES\n");
        return 1;
    }
    printf("NO\n");
    return 0;
}
int gcd(int a,int b)
{
    if(b==0)
     return a;
    return gcd(b,a%b);
}
int main()
{
    int x,y,z;
    scanf("%d %d %d",&x,&y,&z);
    canGetSoln(x,y,z);
    return 0;
}
