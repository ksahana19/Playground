#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,s=11;
  cin>>n;
  for(int i=0;i<n;i++)
  {
cout<<pow(s,2)<<" ";
    s+=4;
  }
}