#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int n;
  float h;
  std::cin>>n>>h;
  if(n>3)
  {
    std::cout<<"Number of items is more";
}
  else if(n==2)
  {
    h=h+((h*50)/100);
  std::cout<<std::setprecision(4)<<h;
}
  else if(n==3)
  {
    h=h*2;
  std::cout<<std::setprecision(4)<<h;
  }
}