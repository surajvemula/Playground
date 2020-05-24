#include<iostream>
int res(int );
int main()
{
  int n,r;
  int d;
  std::cin>>n;
  int t=n,a,sum=n;
  a=res(sum);
  while(a>9)
  {
    a=res(a);
  }
    std::cout<<a;
}
int res(int sum)
{ int d,r=0;
  while(sum>0)
  {
    r=r+sum%10;
    sum=sum/10;
  }
  return r;
}