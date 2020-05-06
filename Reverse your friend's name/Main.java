#include<iostream>
#include<string>
int main() 
{ 
//Type your code here
  std::string str;
 std::getline(std::cin,str);
/*  for(std::string::reverse_iterator
      i=str.rbegin(); i<str.rend;i++)
    std::cout<<*i;*/
  int s=str.size();
  for(auto i = s-1;i>=0;i--)
    std::cout<<str.at(i);
  

    
}