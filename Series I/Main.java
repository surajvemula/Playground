#include<iostream>
int main()
{
  float n=0.5;
  int m;
  int a=1;
  std::cin>>m;
  int count=0;
  while(count!=m)
  {
    count++;
    if(count==1)
  {
    std::cout<<n<<" ";
  }
  else if(count==2)
  {
    n=n+1;
    std::cout<<n<<" ";
  }
   else
   {
     a=a*3;
     n=n+a;
     std::cout<<n<<" ";
   }
  }
}