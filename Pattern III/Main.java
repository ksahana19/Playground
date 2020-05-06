#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int j, k = 0; 
    for (int i=1; i<=n; i++) 
    { 
        if (i%2 != 0) 
        { 
            for (j=k+1; j<k+i; j++) 
                cout << i << "*"; 
            cout << i << endl;     
        } 
        else
        { 
            k = k+i-1; 
            for (j=k; j>k-i+1; j--) 
                cout << i << "*"; 
            cout << i << endl;     
        } 
    } 
  for (int i=n; i>=1; i--) 
    { 
        if (i%2 != 0) 
        { 
            for (j=k+1; j<k+i; j++) 
                cout << i << "*"; 
            cout << i << endl;     
        } 
        else
        { 
            k = k+i-1; 
            for (j=k; j>k-i+1; j--) 
                cout << i << "*"; 
            cout << i << endl;     
        } 
    }
}  