#include<iostream>
using namespace std;
int main()
{
  int i=1;
  int n;
  int c=4;
  int sr;
  int sum;
  std::cin>>n;
  sum=n;
  while(c==4)
  {
    sr=i*i;
    if(sr==n)
    {
      sum=sum+i+1;
      c=2;
    }
    else if(sr>n)
    {
      sum=sum+i;
      c=2;
    }
    i++;
  }
  std::cout<<sum;
}