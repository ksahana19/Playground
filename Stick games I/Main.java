#include<iostream>
using namespace std;
void print(int n)
{
  if(n==0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}
int main()
{
  //Type your code here.
  int n,m,flag=0;
  cin>>n>>m;
  int sticks=m+n;
  int i=m*n;
  for(int j=1;i!=0;j++)
  {
    if(j%2==1)
     flag=1;
    else
      flag = 0;
    sticks-=2;
    i-=m;}
    print(flag);
    
}