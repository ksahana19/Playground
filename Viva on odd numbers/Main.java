#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int c=0,i=0,n;
  float score=0;
  while(c<3&&i==0)
  {
    cin>>n;
    if(n<0)
    {i=1;
     score--;}
    else if(n%2==1)
    {
      c++;
      score++;
    }
    else
      score-=0.5;}
  cout<<score;
}