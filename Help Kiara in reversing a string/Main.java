#include <iostream>
#include<string.h>
int main()
{
char str[100], rev[100];     
int count = 0, end, i;    
//Your code goes here    
  std::cin.getline(str,100);

  while (str[count] != '\0')
      count++;
  end = count-1;
  for (i = 0; i < count; i++) {
    rev[i]=str[end--];
  }
std::cout<<rev;
}