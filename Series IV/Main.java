#include<iostream>
int main()
{
  int n=1,s;
  int m;
  std::cin>>m;
  int count=0;
  while(count!=m)
  {
    count++;
    if(n%2==0)
    {
      s=n*n-2;
      std::cout<<s<<" ";
 n=n+1;
    }
    else
    {
      s=n*n-1;
      std::cout<<s<<" ";
      n=n+1;
    }
  }
}