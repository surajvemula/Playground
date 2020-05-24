#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  std::cin>>r>>c>>t;
  int m;
  m=r-1;
  int c1;
  c1=r*m;
  if(t>r && t<=r*2)
  {
    std::cout<<"It is a mango tree";
}
  else if(t>(r*(r-2)) && t<=c1)
  {
       std::cout<<"It is a mango tree";
  }
  else
  {
    std::cout<<"It is not a mango tree";
  }
}
    