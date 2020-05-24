#include<iostream>
#include<string>
using namespace std;
int main()
{
 string a;
 int b;
 std::cin>>a>>b;
 if(a=="front")
 {
   if(b==1)
     std::cout<<"Left Handed";
   else
     std::cout<<"Right Handed";
}
 else
 {
   if(b==1)
     std::cout<<"Right Handed";
   else
     std::cout<<"Left Handed";
 }
 }