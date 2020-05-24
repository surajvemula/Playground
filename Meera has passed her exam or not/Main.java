#include<iostream>
int main()
{
 int n,m;
   int p=0;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  std::cin>>m;
  for(int i=0;i<n;i++)
      {
        if(m==a[i])
        {
          p=1;
   break;
        }
        else
        {
         p=0;
        }
  }
  if(p==1)
  {
          std::cout<<"She passed her exam";
  }
  else
  {
    std::cout<<"She failed";
}
}