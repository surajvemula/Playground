#include<iostream>
int main()
{
  int n;
  int p;
  std::cin>>n;
  p=n;
  int m=1,t,t1,t2,c=0,s=0;
  for(int i=1;i<=n;i++)
  {
    if(i==1)
    {
      for(int j=0;j<n;j++)
      {
    std::cout<<m<<"*";
    m=m+1;
    }
      t=m;
      m=n*n+1;
      t1=m;
      for(int j=0;j<n;j++)
      {
      std::cout<<m;
if(j!=n-1)
{
  std::cout<<"*";
}
        m=m+1;
      }
      std::cout<<"\n";
    }
    else
    {   
      s=s+2;
      p=p-1;
      for(int j=0;j<n*2;j++)
      {
        if(j<s)
        {
          std::cout<<"-";
        }
        else if(j<=p+s-1)
        {
          std::cout<<t<<"*";
          t++;
        }
        else
        {
          c=c+1;
        }
      }
      t1=t1-c;
      t2=t1;
      for(int j=0;j<c;j++)
      {
       std::cout<<t2;
        if(j!=c-1)
        {
std::cout<<"*";
        }
      t2++;
      }
      std::cout<<"\n";
      c=0;
    }
  }
}