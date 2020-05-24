#include<iostream>
using namespace std;
int main()
{
  int n;
  int c=1;
  float s=0;
  int i=0;
  while(c!=2)
  {
    std::cin>>n;
    if(n>0 && n%2!=0)
    {
s=s+1;
      i++;
      if(i==3)
      {
        std::cout<<s;
    c=2;
      }
    }
    else if(n>0 && n%2==0)
    {
      s=s-0.5;
    }
    else if(n<0)
    {
      s=s-1;
      c=2;
      std::cout<<s;
    }
}
}