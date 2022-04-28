import java.io.*;
class switchcase
{
public static void main(String arg[])
{
int a= 0 ,b=0  ;
char c[]={'j','e','r','l','i','n'};
for(int i=0 ;i<=5 ; i++)
{
switch(c[i])
{
case 'a' : 
a++;
break;
case 'e' :
a++;
break;
case 'i' :
a++;
break;
case 'o' :
a++;
break;
case 'u' :
a++;
break;
default :
b++ ;
}
}
System.out.println("number of vovels = "+ a );
System.out.println( "number of non vovels = "+b );
}
}





