#include<iostream>
using namespace std;
int main()
{
  int n;
  int r;
  std::cin>>n;
  if(n==1)
  {
    r=0;
    std::cout<<r;
  }
  else if(n==2 || n==3)
  {
    r=1;
    std::cout<<r;
  }
  else if(n>3)
  {
    int c=3;
    int sum=0;
    int n1=1,n2=1;
    while(c!=n)
    {
    sum=n1+n2;
    n1=n2;
    n2=sum;
      c++;
}
    std::cout<<sum;
  }
}