#include<iostream>
int main()
{
  int r,c;
  std::cin>>r>>c;
  int a[r][c],b[r][c],add[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
std::cin>>a[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
std::cin>>b[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
add[i][j]=a[i][j]+b[i][j];
    }
  }
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
std::cout<<add[i][j]<<" ";
    }
    std::cout<<"\n";
  }
}