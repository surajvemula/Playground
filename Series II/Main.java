#include<iostream>
int main()
{
int n=11;
  int m;
  int s;
  std::cin>>m;
  int count=0;
  while(count!=m)
  {
count++;
    if(count==1)
    {
      n=n*n;
    std::cout<<n<<" ";
    n=11;
    }
    else
    {
      n=n+4;
s=n*n;
      std::cout<<s<<" ";
    }
  }
}