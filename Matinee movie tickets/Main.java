#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float time;
  cin>>age>>time;
  int t=round(time*100);
  if(age>13)
  {
    if(t==1330)
      cout<<"$5.00";
    else
      cout<<"$8.00";}
  else
  {
    if(t!=1330)
      cout<<"$4.00";
    else
      cout<<"$2.00";}    
    
}