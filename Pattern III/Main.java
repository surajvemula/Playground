#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int c=1,t=2;
  for(int i=0;i<n*2;i++)
  {
    if(i==0)
    {
      std::cout<<c<<"\n";
}
    else if(i==n*2-1)
    {
std::cout<<c;
    }
    else if(i<n)
    {
      for(int j=0;j<i+1;j++)
      {
      std::cout<<t;
      if(j!=i)
      {
        std::cout<<"*";
      }
      }
      t=t+1;
      std::cout<<"\n";
    }
    else if(i==n)
    {
     t=t-1;
      for(int j=0;j<i;j++)
      {
        std::cout<<t;
        if(j!=i-1)
        {
          std::cout<<"*";
        }
      }
      std::cout<<"\n";
    }
    else 
    {
      t=t-1;
      for(int j=0;j<t;j++)
      {
        std::cout<<t;
        if(j!=t-1)
        {
          std::cout<<"*";
        }
      }
      std::cout<<"\n";
    }
  }
}