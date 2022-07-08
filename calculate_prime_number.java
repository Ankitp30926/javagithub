class PrimeNumbers
{
public static void main (String[] args)
{
    int i=0;
    int num=0;  //empty string

    String primeNumbers = " ";
    for(num=i; i<= 100; i++)
    {
     
     int counter=0;
     for (num=i; num>=1; num--)
     {

        if(i%num==0)
        {

            counter= counter +1;
        }
     }

     if(counter==2)
     {

        //appended the prime number to the string
        primeNumbers= primeNumbers+i+" ";
     }

    }

    System.out.println("Prime Number From 1 to 100 are :");
    System.out.println(primeNumbers);
}

}