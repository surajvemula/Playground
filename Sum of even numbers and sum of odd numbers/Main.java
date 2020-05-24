#include<iostream>
using namespace std;
int main()
{
	int n,a[100],e[50],o[50],es=0,os=0;
    cin>>n;
    for(int i=0;i<n;i++)
    {
    cin>>a[i];
    }
    for(int i=0;i<n;i++)
    {
    	if(a[i]%2==0)
        {
        	e[i]=a[i];
        }
        else
        {
        	o[i]=a[i];
        }
    }
    for(int i=0;i<n;i++)
    {
    	es=es+e[i];
        os=os+o[i];
    }
    cout<<"The sum of the even numbers in the array is "<<es<<'\n';
    cout<<"The sum of the odd numbers in the array is "<<os;
}
