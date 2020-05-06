#include <string.h>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
  string str;
  getline(cin,str);
  int c=0;
  for(int i=0;str[i]!='\0';i++)
    if(str[i]==' ')
      c++;
  if(c<=10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
  
   
}