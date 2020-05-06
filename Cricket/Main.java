#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here
  int b,r,rs,nb;
  float o,to,crr,rrr;
  cin>>b>>r>>rs>>nb;
  to=b/6.0;
  o= nb/6 + nb%6*.1;
  crr=round(rs/o * 10)/10;
  rrr=round(r/to * 10)/10;
  cout<<to<<"\n"<<o<<"\n"<<crr<<"\n"<<rrr;
  if(crr<rrr)
    cout<<"\nNot Eligible to Win";
  else
    cout<<"\nEligible to Win";
  
  
}