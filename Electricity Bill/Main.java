#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int u,r;
  cin>>u;
  if(u<=200)
  {r=u*0.5;}
  else if(u<=400)
  { r=u*0.65+100;}
  else if(u<=600)
  { r=u*0.8 +200;}
  else
  {r=u*1.25+425;}
  cout<<"Rs."<<r;
}