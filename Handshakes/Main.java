#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  n=n-1;
  int sum;
  for(int i=1;i<=n;i++)
  {
    sum=sum+i;
  }
  std::cout<<sum;
}