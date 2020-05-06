#include<iostream>
using namespace std;
int main()
{
  int en,num,i,temp,sum=0;
  cin>>en>>num;
  temp=en+num;
  for(i=1;i<=(temp/2)+1;i++)
  {  if(temp%i==0)
      sum+=i;}
  if(temp==sum)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}