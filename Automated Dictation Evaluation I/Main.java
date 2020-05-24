#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char strg1[50], strg2[50];
    gets(strg1);
    gets(strg2);
    if(strcmp(strg1, strg2)==0)
    {
      cout<<"It is correct";
    }
    else
    {
      cout<<"It is wrong";
    }
    return 0;
}