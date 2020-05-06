#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  string side;
  int rail;
  cin>>side>>rail;
if(side.compare("front"))
{
  if(rail==1)
  cout<<"Right Handed";
  else
    cout<<"Left Handed";
}
  if(side.compare("rear"))
{
  if(rail==1)
  cout<<"Left Handed";
  else
    cout<<"Right Handed";
}
  
}