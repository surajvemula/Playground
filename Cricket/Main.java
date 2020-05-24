#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
 int balls,total,runs,bf;
int overs;
  float of,rr,cr,r;
  std::cin>>balls>>total>>runs>>bf;
  overs=balls/6;
  std::cout<<overs<<"\n";
  of=(bf/6);
  r=bf%6;
  r=r/10;
  of=of+r;
  std::cout<<of<<"\n";
  cr=runs/of;
  if(cr>=10)
  {
    std::cout<<std::setprecision(3)<<cr<<"\n";
}
  else
  {
    std::cout<<std::setprecision(2)<<cr<<"\n";  
  }
  r=overs;
  rr=total/r;
  std::cout<<std::setprecision(2)<<rr<<"\n";
  if(cr>=rr)
  {
      std::cout<<"Eligible to Win"<<"\n";
  }
  else
  {
       std::cout<<"Not Eligible to Win"<<"\n";
  }
}
  