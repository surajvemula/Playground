#include<iostream>
using namespace std;
int power(int,int);
int main()
{
	int n,p,a,r;
  std::cout<<"Enter the value of a\n";
  std::cin>>n;
  r=n;
  std::cout<<"Enter the value of n\n";
  std::cin>>p;
 if(p==1)
 {
   std::cout<<"The value of "<<n<<" power "<<p<<" is "<<n;
 }
  else
  {
  for(int i=0;i<p-1;i++)
  {
    r=r*n;
}
  std::cout<<"The value of "<<n<<" power "<<p<<" is "<<r;
  }
}
