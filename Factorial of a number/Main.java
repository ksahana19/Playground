#include<iostream>
int main(){
  // Type your code here
  int n,i,fact=1;
  std::cin>>n;
  for(i=1;i<=n;i++)
    fact*=i;
  std::cout<<fact;
}