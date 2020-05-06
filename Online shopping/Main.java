#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p[3],dis[3],s[3],i,flip,sn,am;
  for(i = 0;i<3;i++)
  {
    cin>>p[i]>>dis[i]>>s[i];}
  flip=p[0] - (p[0]*(dis[0]/100.0)) + s[0];
    sn=p[1] - (p[1]*(dis[1]/100.0)) + s[1];
    am=p[2] - (p[2]*(dis[2]/100.0)) + s[2];
  cout<<"In Flipkart Rs."<<flip<<"\nIn Snapdeal Rs."<<sn<<"\nIn Amazon Rs."<<am;
  if((flip<=sn) &&(flip<=am))
  {
    cout<<"\nHe will prefer Flipkart";}
   else if((sn<flip)&&(sn<=am))
   {
     cout<<"\nHe will prefer Snapdeal";}
  else
  { cout<<"\nHe will prefer Amazon";
  }
     
     
      
}