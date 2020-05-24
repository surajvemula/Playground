#include <iostream>
using namespace std;
int fib(int x) {
   if((x==1)||(x==0)) {
      return(x);
   }else {
      return(fib(x-1)+fib(x-2));
   }
}
int main() {
   int x , i=0,a;
   cin >> x;
   while(i < x) {
      a=fib(i);
      i++;
   }
  std::cout<<"The term "<<x<<" in the fibonacci series is "<<a;
   return 0;
}