#include<iostream>
int main()
{
int no,a=0;
std::cin>>no;
  if(no==0)
  {
    a=1;
    std::cout<<a;
  }
  else
  {
while(no>0)
{
no=no/10;
a++;
}
std::cout<<a;
  }
}