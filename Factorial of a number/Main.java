#include <iostream>  
using namespace std;  
int main()  
{  
   int i,fact=1,number;        
 std::cin>>number;    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  std::cout<<fact<<endl;  
  return 0;  
}