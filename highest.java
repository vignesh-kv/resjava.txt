import java.util.Scanner;
class highest{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>=15 && b>=25){
System.out.print("a is greater");
}if(b>=15 && b>=25){
System.out.print("b is greater");
}else{
System.out.print("c is greater");
}
}
}