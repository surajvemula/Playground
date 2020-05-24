#include<iostream>
using namespace std;
int main()
{
 int u,b;
  std::cin>>u;
  if(u<=200)
  {
b=u*0.5;
}
  else if(u<=400)
  {
    b=(u*0.65)+100;
  }
  else if(u<=600)
  {
b=(u*0.80)+200;
  }
  else
  {
    b=(u*1.25)+425;
  }
  std::cout<<"Rs."<<b;
}