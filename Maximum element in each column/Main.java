#include<iostream>
#include<iostream>
using namespace std;
const int MAX =100;
void largest(int mat[][MAX],int rows,int cols)
{
  for(int i=0;i<cols;i++)
  {
    int maxm = mat[0][i];
    for(int j=1;j<rows;j++)
    {
      if(mat[j][i]>maxm)
        maxm=mat[j][i];
    }
    cout<<maxm<<endl;
  }
}
int main()
{
 int n,m,i,j;
  int mat[MAX][MAX];
  cin>>n>>m;
  for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      cin>>mat[i][j];
    }
  }
  largest(mat,n,m);
  return 0;
}