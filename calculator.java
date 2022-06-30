import java.lang.*;
class Multiply {
public static void main ( String args[])
{
int num1=20, num2=30;
int mul=num1*num2;
System.out.println(mul);
 
add(20,30);
subs(20,10);
division(20,10);
}

public static void add(int num1, int num2){

    int sum=num1+num2;
    System.out.println(sum);
}

public static void subs(int num1,int num2){

    int sub=num1-num2;
    System.out.println(sub);
}

public static void division(int num1,int num2){

    int div=num1/num2;
    System.out.println(div);
}
}
