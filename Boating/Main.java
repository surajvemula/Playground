#include<iostream>
using namespace std;
int main()
{
int t,a,c;
  std::cin>>t>>a>>c;
  int sum;
  sum=(a*75)+(c*30);
  if(sum<t)
  {
    std::cout<<"Boat is stable";
}
  else
  {
     std::cout<<"Boat will drow";
  }
}