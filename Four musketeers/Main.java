#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int x1,x2,x3,y1,y2,y3;
  float X,Y;
  std::cin>>x1;
  std::cin>>y1;
  std::cin>>x2;
  std::cin>>y2;
  std::cin>>x3;
  std::cin>>y3;
 double x=(x1+x2+x3);
 double y=(y1+y2+y3);
  X=x/3;
  Y=y/3;
  std::cout<<std::setprecision(6);
  std::cout<<X<<"\n"<<Y;
}