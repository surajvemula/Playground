#include<iostream>
int main()
{
  int n,m;
  std::cin>>n>>m;
  if(m<n)
  {
    std::cout<<"Yes, you can enter.";
  }
  else if(m==n)
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else if(m>n)
  {
    std::cout<<"Sorry, you can't enter";
  }
}