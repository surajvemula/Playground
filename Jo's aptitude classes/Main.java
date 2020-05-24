#include<iostream>
int main()
{
int a,b,c,d;
  std::cin>>a>>b>>c>>d;
 int small=0;
  int gcd=0;
  if(a<b && a<c)
    small=a;
else if(b<a && b<c)
  small=b;
  else
    small=c;
  while(small>=1)
  {
    if(a%small==0 && b%small==0)
    {
      if(c%small==0)
      {
        gcd=small;
        break;
      }
    }
    small--;
  }
if(gcd==d)
{
  std::cout<<"Answer is correct.";
}
else
{
  std::cout<<"Answer is wrong.";
}
}