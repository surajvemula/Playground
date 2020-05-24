#include<iostream>
int main()
{
  int n=6;
  int m;
  std::cin>>m;
  int count=0,s=0;
  while(count!=m)
  {
    count++;
if(count==1)
{
  std::cout<<n<<" ";
}
    else
    {
      s=s+5;
      n=n+s;
      std::cout<<n<<" ";
    }
  }
}