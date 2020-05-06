#include<iostream>
int main()
{
  int a;
  std::cin>>a;
  std::cout<<a<<" is a ";
  if(a>=0)
  {
    std::cout<<"positive number.";
  }
  else
  {
    std::cout<<"negative number.";
  }
}