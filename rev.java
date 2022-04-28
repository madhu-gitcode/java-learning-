import java.io.*;
class rev
{
public static void main(String arg[])
{
int n=54375 , reverse =0 ,rem ;
while(n !=0){
rem = n%10;
reverse=reverse * 10 + rem;
n=n/10;
}
System.out.println(reverse);
}
}