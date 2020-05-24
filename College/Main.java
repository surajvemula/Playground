#include <stdlib.h> 
#include <string.h> 
#include<iostream>
#include<iomanip>
using namespace std;
struct college { 
    char name[30],city[20]; 
    int year; 
    float pass; 
}; 
int comparator(const void* p, const void* q) 
{ 
    return strcmp(((struct college*)p)->name, 
                  ((struct college*)q)->name); 
} 
int main() 
{ 
    int i = 0, n,a;
    cin>>n;  
  
    struct college arr[n]; 
    for(i=0;i<n;i++)
    {
   
       cin>>arr[i].name; 
       cin>>arr[i].city; 
       cin>>arr[i].year;
       cin>>arr[i].pass;
    } 
    cout<<"Enter the number of colleges"<<endl;
    qsort(arr, n, sizeof(struct college), comparator);
    for (i = 0; i < n; i++) 
    { 
      cout<<"Enter the details of college "<<i+1<<endl;
      cout<<"Enter name"<<endl<<"Enter city"<<endl<<"Enter year of establishment"<<endl<<"Enter pass percentage"<<endl;
    } 
    cout<<"Details of colleges"<<endl;  
    for(i=0;i<n;i++)  
    {  
      cout<<"College:"<<i+1<<endl<<"Name:"<<arr[i].name<<endl<<"City:"<<arr[i].city<<endl<<"Year of establishment:"<<arr[i].year<<endl<<"Pass percentage:";
      int count =0;
      float no=arr[i].pass;
      while(no!=((int)no))
        {
         count++;
         no=no*10;
        }
      cout<<fixed;
      cout<<setprecision(count);
      cout<<arr[i].pass<<endl;
    }
      /*if(n>1)
      {
          cout<<endl;
      }*/
    
  
    return 0; 
}