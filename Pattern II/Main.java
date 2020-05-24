#include<iostream>
int main()
{
  int n;
  int m=1;
  int count=0,t,s;
  std::cin>>n;
  while(count!=n)
  {
    count++;
    if(count==1)
    {
      std::cout<<m<<"\n";
    }
      else
  {
    if(count%2==0)
    {
      for(int i=0;i<count;i++)
      {
        m=m+1;
      }
      t=m;
     for(int i=0;i<count;i++)
     {
       std::cout<<m;
       m=m-1;
       if(i!=count-1)
       {
         std::cout<<"*";
       }
     }
      std::cout<<"\n";
    }
        else
        {
          for(int j=0;j<count;j++)
          {
             t=t+1;
            m=t;
            std::cout<<m;
            if(j!=count-1)
            {
              std::cout<<"*";
            }
          }
          std::cout<<"\n";
        }
      }
  }
}