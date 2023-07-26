#include<stdio.h>
char* isPossible(int N,int K)
{
    for(int X=1;X<=N;X++){
        int Y=K/X;
        if(Y*X==K && Y<=N)
        {
            return "YES";
        }
    }
    return "NO";
}
int main(){
    int N,K;
    scanf("%d %d",&N,&K);
    char* result=isPossible(N,K);
    printf("%s",result);
    return 0;
}