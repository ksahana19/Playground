#include<iostream>
#include<cmath>
using namespace std;
bool require(int a,int b,int r)
{
  if(pow(a,b)>=r)
    return true;
  else return false;
}
int main()
{
int m,n,req;
  cin>>m>>n>>req;
  if(require(m,n,req))
     cout<<"Doctor, you can proceed with your experiment.";
    else
     cout<<"Sorry Doctor! You need more bacteria.";
     }