import java.io.*;
import java.util.*;
class Main{
public static void main(String[] args)throws IOException
{
int n,m,k;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
m=Integer.parseInt(br.readLine());
k=Integer.parseInt(br.readLine());
if(n>k && n>m)
System.out.println(n+" is greater");
else if(k>n && k>m)
System.out.println(k+" is greater");
else
System.out.println(m+" is greater");
}
}
