import java.lang.*;
class Calculator {
public static void main ( String args[])
{
 
add(20,30);
subs(20,10);
multi(10,20);
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

public static void multi(int num1, int num2){

    int mul=num1*num2;
  System.out.println(mul);

}

public static void division(int num1,int num2){

    int div=num1/num2;
    System.out.println(div);
}
}
