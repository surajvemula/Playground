#include<iostream>
using namespace std;
int main()
{
  int n,i;
  std::cin>>n;
  int total=0;
  int c=0;
  while(total<n)
  {
    std::cin>>i;
    total=total+i;
    c++;
}
  std::cout<<"The number of turns is "<<c;
}