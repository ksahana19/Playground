#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d[7],i,tot=0,sum=0,temp;
  for(i=0;i<7;i++)
  {
    cin>>d[i];
    sum+=d[i];
  }
  temp =sum;
  temp-=(d[0]+d[6]);
  tot=sum*100;
  if(temp>40)
    tot+=(temp-40)*25;
  else{
  tot+=d[0]*100*0.50;
  tot+=d[6]*100*0.25;}
  for(i=0;i<7;i++)
    if(d[i]>8)
      tot+=(d[i]-8) * 15;
  cout<<tot;
  
  
  
}