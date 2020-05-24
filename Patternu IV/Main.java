#include <iostream>
using namespace std;
int main() 
{
 int n,t;
  std::cin>>n;
  int m=1;
  for(int i=1;i<=n;i++)
  {
    if(i==1)
    {
for(int j=1;j<n;j++)
{
   std::cout<<m;
  if(j==n-1)
  {
  m=m+1;
  std::cout<<m;
  }
}
    std::cout<<"\n";
    }
    else
    {
      if(i%2==0)
      {
        std::cout<<i+1;
        t=i+1;
        for(int j=1;j<n;j++)
        {
          std::cout<<m; 
        }
        std::cout<<"\n";
      }
      else
      {
        m=t;
        for(int j=1;j<n;j++)
        {
          std::cout<<m;
        }
        m=m+1;
        std::cout<<m;
        std::cout<<"\n";
      }
    }
  }
    return 0;
}