#include <stdlib.h> 
#include <string.h> 
#include<iostream>
#include<iomanip>
using namespace std;
struct Student { 
    char name[30],department[20]; 
    int year; 
    double cgpa; 
}; 
int comparator(const void* p, const void* q) 
{ 
    return strcmp(((struct Student*)p)->name, 
                  ((struct Student*)q)->name); 
} 
int main() 
{ 
    int i = 0, n,a;
    cin>>n;  
  
    struct Student arr[n]; 
    for(i=0;i<n;i++)
    {
   
       cin>>arr[i].name; 
       cin>>arr[i].department; 
       cin>>arr[i].year;
       cin>>arr[i].cgpa;
    } 
    cout<<"Enter the number of students"<<endl;
    qsort(arr, n, sizeof(struct Student), comparator);
    for (i = 0; i < n; i++) 
    { 
      cout<<"Enter the details of student "<<i+1<<endl;
      cout<<"Enter name"<<endl<<"Enter department"<<endl<<"Enter year of study"<<endl<<"Enter cgpa"<<endl;
    } 
      cout<<"Details of students"<<endl;
     for(i=0;i<n;i++)
     {
      cout<<"Student "<<i+1<<endl;
      cout<<"Name:"<<arr[i].name<<endl<<"Department:"<<arr[i].department<<endl<<"Year of study:"<<arr[i].year<<endl<<"CGPA:";
      int count =0;
      double no=arr[i].cgpa;
      while(no!=((int)no))
        {
         count++;
         no=no*10;
        }
      cout<<fixed;
      cout<<setprecision(count);
      cout<<arr[i].cgpa<<endl;
    }
    return 0; 
}
