#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,n;
  float i,a,d,f;
  cin>>p>>r>>n;
  i=p*r*n/100;
  a=i+p;
  d=0.02*i;
  f=a-d;
  cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<f;
}