#include<iostream>
using namespace std;
int main()
{
  int fc,fd,fs,sc,sd,ss,ac,ad,as;
  std::cin>>fc>>fd>>fs>>sc>>sd>>ss>>ac>>ad>>as;
  float afterdiscountflipkart,afterdiscountsnapdeal,afterdiscountamazon,totalflipkartprice,totalsnapdealprice,totalamazonprice;
  afterdiscountflipkart=((fc*fd)/100);
totalflipkartprice=fc-afterdiscountflipkart+fs;
std::cout<<"In Flipkart Rs."<<totalflipkartprice<<"\n";
  afterdiscountsnapdeal=((sc*sd)/100);
  totalsnapdealprice=sc-afterdiscountsnapdeal+ss;
std::cout<<"In Snapdeal Rs."<<totalsnapdealprice<<"\n";
  afterdiscountamazon=((ac*ad)/100);
  totalamazonprice=ac-afterdiscountamazon+as;
std::cout<<"In Amazon Rs."<<totalamazonprice<<"\n";
  if(totalflipkartprice<totalamazonprice && totalflipkartprice<=totalsnapdealprice)
  {
      std::cout<<"He will prefer Flipkart";
  }
    else if(totalsnapdealprice<totalamazonprice && totalsnapdealprice<totalflipkartprice)
  {
       std::cout<<"He will prefer Snapdeal"; 
}
  else if(totalamazonprice<totalsnapdealprice && totalamazonprice<totalflipkartprice)
  {
      std::cout<<"He will prefer Amazon";
    }
}