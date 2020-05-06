#include<iostream>
using namespace std;
int main()
{
  int l,r,i,j,sum;
  cin>>l>>r;
  for(i=l;i<=r;i++)
  {
    sum=0;
      for(j=1;j<=(i/2);j++)
  {  if(i%j==0)
      sum+=j;}
    if(sum==i)
      cout<<i<<" ";
  }
}