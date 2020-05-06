#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,no=0;
  cin>>n;
  do{
    no++;
    n/=10;}
    while(n>0);
  cout<<no;
    
  
}