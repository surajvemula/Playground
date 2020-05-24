#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,b;
  int x,y,z,result;
  std::cin>>a;
  std::cin>>b;
  x=(a-3)*(a-3);
  y=(b-4)*(b-4);
  z=x+y;
  result=sqrt(z);
  std::cout<<result;
}