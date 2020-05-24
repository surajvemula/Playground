#include<iostream>
using namespace std;
int main()
{
  int sum=0,n,s,a[10];
  cin>>n>>s;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    sum=sum+a[i];
  }
  if(sum<=s)
  {
    cout<<"YES";
  }
  else
  {
    cout<<"NO";
  }
  return 0;
}