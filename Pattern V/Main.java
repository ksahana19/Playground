#include <iostream> 
using namespace std;   
int main() 
{ 
    int num; 
  cin>>num;
    int d;      
    int i, j, l, r;  
    l = 1;  
    r = num * num + 1;  
    for (i = num; i > 0; i--) {   
        for (d = num; d > i; d--) 
            cout << "--"; 
        for (j = 1; j <= i; j++) { 
            cout << l; 
            cout << "*"; 
            l++; 
        } 
        for (j = 1; j <= i; j++) { 
            cout << r; 
            if (j < i) 
                printf("*"); 
            r++; 
        } 
        r = r - (i - 1) * 2 - 1; 
        cout << "\n"; 
    } 
} 