import java.io.*;
class matricssub{
public static void main(String arg[]){
int x[][]={{1,2,3},{4,5,6},{7,8,9}};
int y[][]={{1,2,3},{4,5,6},{7,8,9}};
int res[][]= new int[3][3];
for(int i=0 ; i<3 ; i++){
for( int j=0 ; j<3 ; j++){
res[i][j]=x[i][j]-y[i][j];
System.out.print(" "+res[i][j]+" ");
}
System.out.println();
}
}
}