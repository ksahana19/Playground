#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int bir,cur;
  cin>>bir>>cur;
  if(bir>cur)
    cout<<100-bir+cur;
  else
    cout<<cur-bir;
}