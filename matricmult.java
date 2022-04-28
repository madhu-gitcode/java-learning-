import java.io.*;
class matricmult{
public static void main(String arg[]){
int x[][]={{1,2,3},{4,5,6},{7,8,9}};
int y[][]={{1,2,3},{4,5,6},{7,8,9}};
int res[][]= new int[3][3];
for(int i=0 ; i<=2 ;i++)
{
for( int j=0 ; j<=2 ; j++)
{
res[i][j]=0;
for(int k=0 ; k<=2 ; k++){
res[i][j] = res[i][j]+x[i][k]*y[k][j];
}
System.out.print(res[i][j]+"  ");

}
System.out.println();
}
}
}
