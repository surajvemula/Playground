#include<iostream>
using namespace std;
int main()
{
  int n;
  int sum,l,f,c=0;;
  std::cin>>n;
  l=n%10;
  sum=l;
  while(n>=10)
  {
    n=n/10;
    c++;
  }
  if(c<3)
  {
    n=0;
  }
  else
  {
  f=n;
  }
  sum=sum+f;
  std::cout<<sum;
}