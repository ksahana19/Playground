#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mil;
  int lit,dist;
  cin>>mil>>lit>>dist;
  if(mil*lit<dist)
    cout<<"Cannot reach";
  else
   cout<<"Can reach";
}