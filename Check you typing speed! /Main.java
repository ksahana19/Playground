#include<iostream>
int main()
{
  int id,score;
  std::cin>>id>>score;
  if(score>0)
  {
    std::cout<<id<<" is eligible for reward.";
  }
}