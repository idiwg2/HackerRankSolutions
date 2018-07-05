
import static java.lang.System.in;

class Prime
{
    public void checkPrime(int...a)
    {
        for(int i : a)
        {
           boolean track = true;
           if(i < 2)
              track = false;
            for(int j=2; j*j<=i;j++)
            {
                if(i%j==0)
                    track = false;
            }
            System.out.print(track==true?i+" ":"");
        }
        System.out.println();
    }
}