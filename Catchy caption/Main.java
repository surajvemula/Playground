#include <cstring>
#include <iostream>
int main()
{
  char str[100] ;
   std::cin.getline(str,100); 
     int len=strlen(str);
  if((2*len)<=100){
   std::cout << "Caption eligible for the contest" ;
  }
  else{
    std::cout<<"Caption not eligible for the contest";
  }
  return 0;
}