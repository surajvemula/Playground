#include<iostream>
using namespace std;
int main()
{
 int r,c,t;
  std::cin>>r>>c>>t;
  if(t<=c)
  {
    std::cout<<"Yes";
  }
  else if(t/c==0)
  {
    std::cout<<"Yes";
  }
  else if(t%c==1)
  {
    std::cout<<"Yes";
  }
  else
  {
    std::cout<<"No";
  }
}