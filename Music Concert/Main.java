#include<iostream>
int main(){
  int n;
  std::cin>>n;
  int a[n];
  int c=0,o=0;
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  } 
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      c++;
    }
    else
    {
      o++;
    }
  }
  std::cout<<o<<"\n"<<c;
  return 0;
}