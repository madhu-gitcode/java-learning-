import java.io.*;
class prime
{
public static void main(String arg[])
{
int num=7 ,i ,count=0;
count=0;
for(i=1 ; i<=num ;i++){
    if(num%i==0){
count++;
}
}
if (count==2){
System.out.println("this is a prime number");

}else {

System.out.println("this is not a prime number");
}
}
}

