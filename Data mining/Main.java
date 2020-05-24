#include<iostream>
using namespace std;
int main()
{
 int n;
 int even=0,odd=0,c;
  std::cin>>n;
  while(n>0)
  {
c=n%10;
    if(c%2==0)
      even=even+c;
    else
      odd=odd+c;
    n=n/10;
}
  if(even==odd)
  {
std::cout<<"Yes";
  }
  else
  {
    std::cout<<"No";
  }
}