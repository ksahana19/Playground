#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num,ls=0,rs=0;
  cin>>num;
  int c=1;
  while(num>0)
  {
    if(c%2==0)
    {
      rs+=num%10;
    }
    else{
      ls+=num%10;}
    num/=10;
    c++;}
  if(ls==rs)
  {
    cout<<"Yes";
  }
  else
    cout<<"No";
}