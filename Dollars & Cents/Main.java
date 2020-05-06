#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d[2],c[2],i,td=0,tc=0,temp;
  for(i=0;i<2;i++)
  {
    cin>>d[i]>>c[i];
    td+=d[i];
    tc+=c[i];
  }
  if(tc>100)
  {
    temp=tc/100;
    tc=tc%100;
    td+=temp;}
  cout<<td<<"\n"<<tc;
}