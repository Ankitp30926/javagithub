
class HellowProgram{

    public static void main(String[] args){
System.out.println("Hello world!");
int a=40, b=50, c=60, d=70;
System.out.println(findlargenum(c,d));
System.out.println(findlargenum(d,c,a));
System.out.println(findlargenum(c,d,a,b));

    }
    public static int  findlargenum(int a, int b){
if (a<b)
return b;
else
return a;

    }
public static int findlargenum(int a, int b, int c){
if (a<b)
{
    if(b<c)
     return c;
     else
     return b;
}
else
{
    if(a<c)
    return c;
    else
    return a;
}

}
public static int findlargenum(int a, int b, int c, int d){

if(a<b)
{
    if(b<c)
    return c;
    else
    return b;
}
else{
    if(a<c)
    return c;
    else
    return a;

}

}
}