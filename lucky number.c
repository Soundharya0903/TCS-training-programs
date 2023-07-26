#include<stdio.h>
int main()
{
    char s[100];
    scanf("%s",s);
    int sum=0;
    for(int i=0;s[i]!='\0';i++)
    {
        if(s[i]>='a' && s[i]<='z')
        {
            sum+=(s[i]-'a'+1);
        }
         else if(s[i]>='A' && s[i]<='z')
        {
            sum+=(s[i]-'A'+1);
        }
    }
    if(sum%9==0)
    {
        printf("9");
    }
    else
    {
        printf("%d",sum%9);
    }
}

