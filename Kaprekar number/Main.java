#include<iostream>
using namespace std;
int main()
{
 int n,temp;
  int s,rev=0,rem,rev1=0,rem1,org=0,org1=0,r,r1,add=0,d=0,i=0;
  std::cin>>n;
  temp=n;
  while(n>0)
  {
n=n/10;
    d++;
}
  s=temp*temp;
  while(i<d)
  {
rem=s%10;
    rev=rev*10+rem;
    s=s/10;
    i++;
  }
  while(rev>0)
  {
    r=rev%10;
    org=org*10+r;
    rev=rev/10;
  }
  add=org+s;
  if(add==temp)
  {
    std::cout<<"Kaprekar Number";
  }
  else
  {
    std::cout<<"Not a Kaprekar Number";
  }
}