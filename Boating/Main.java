#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,a,c;
  cin>>w>>a>>c;
  int sum = (a*75) + (c*30);
  if(sum<w)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
}