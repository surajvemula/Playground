#include<iostream>
#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
int d1,c1,d2,c2,c,d,r=0;
  std::cin>>d1>>c1>>d2>>c2;
  c=c1+c2;
  if(c>=100)
  {
    r=c/100;
    c=c%100;
  }
  d=d1+d2+r;
  std::cout<<d<<"\n"<<c;
}