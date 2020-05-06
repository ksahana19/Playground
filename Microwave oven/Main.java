#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float ht;
  cin>>n>>ht;
  if(n>3)
    cout<<"Number of items is more";
  else
  {
    if(n==2)
      cout<<ht + ht/2;
    else
      cout<<ht*2;}
}