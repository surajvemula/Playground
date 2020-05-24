#include<iostream>
int check(int,int,int);
int main()
{
  int n,m,r;
  std::cin>>n>>m>>r;
  int c;
  check(n,m,r);
}
int check(int a,int b,int c)
{
  int d=1;
  for(int i=0;i<b;i++)
  {
  d=d*a;
  }
  if(d>=c)
  {
    std::cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    std::cout<<"Sorry Doctor! You need more bacteria.";
  }
}