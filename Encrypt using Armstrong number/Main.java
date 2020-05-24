#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int t=n,t1=n;
  int c=0,p,sum=0;
  int r;
  while(n>0)
  {
    n=n/10;
    c++;
  }
  while(t1>0)
  {
    r=t1%10;
  p=power(r,c);
  sum=sum+p;
    t1=t1/10;
}
  if(sum==t)
  {
    return 1;
  }
  else
  {
    return 0;
  }
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}