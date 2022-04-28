import java.io.*;
class logic
{
public static void main(String arg[])
{
int a=5 ,b=10,c=7,i=0;
if(a>b && a>c){
System.out.println(a +" is the greater than all");
}else if(b>a && b>c){
System.out.println(b +" is greater than all");
}else{
System.out.println(c+" is greater than all");
}

System.out.println("  OR   ");
if(i==0 || i==1){
System.out.println("true");
}

System.out.println("  NOT   ");
if(!(i==0 || i==1)){
System.out.println("true");
}else{
System.out.println("false");
}

}
}

