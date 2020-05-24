#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>arr[i];
  }
  int max=arr[0];
  for(int i=1;i<n;i++)
  {
    if(arr[i]>max)
    {
      max=arr[i];
    }
  }
  std::cout<<max;
}