#include<iostream>
#include<string.h>
using namespace std;
  void reverseStr(string& str) 
{ 
    int n = str.length(); 
    for (int i = 0; i < n / 2; i++) 
        swap(str[i], str[n - i - 1]); 
} 
int main() 
{ 
    string str,temp;
  cin>>str;
  cin>>temp;
    reverseStr(str); 
  if(str==temp)
  {
    cout<<"It is correct";
  }
  else
  {
    cout<<"It is wrong";
  }
    return 0; 
} 