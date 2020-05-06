#include<iostream>
int main()
{
  int max,curr;
  std::cin>>max>>curr;
  if(max==curr)
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else if(max>curr)
  {
    std::cout<<"Yes, you can enter.";
  }
  else{
    std::cout<<"Sorry, you can't enter";
  }
}
