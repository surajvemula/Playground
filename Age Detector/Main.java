#include<iostream>
using namespace std;
int main()
{
  int a,b;
  std::cin>>a>>b;
  int c,d,age;
  c=b-a;
  if(c<=0)
  {
    d=100-a;
age=d+b;
  }
  else
  {
    age=c;
  }
  std::cout<<age;
}
  